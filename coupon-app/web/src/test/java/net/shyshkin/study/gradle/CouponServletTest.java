package net.shyshkin.study.gradle;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class CouponServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    RequestDispatcher requestDispatcher;

    @Mock
    PrintWriter printWriter;

    private CouponServlet couponServlet;

    @BeforeEach
    void setUp() {
        couponServlet = new CouponServlet();
    }

    @Test
    void doGet_Art() throws IOException, ServletException {
        //given
        given(response.getWriter()).willReturn(printWriter);

        //when
        couponServlet.doGet(request, response);

        //then
        then(printWriter).should().print(eq("SUPERSALE"));
    }

    @Test
    void doGet_Bharath() throws IOException, ServletException {
        //given
        StringWriter stringWriter = new StringWriter();
        var printWriter = new PrintWriter(stringWriter);

        given(response.getWriter()).willReturn(printWriter);

        //when
        couponServlet.doGet(request, response);

        //then
        assertEquals("SUPERSALE", stringWriter.toString());
    }

    @Test
    void doPost() throws ServletException, IOException {
        //given
        given(request.getParameter(anyString())).willReturn("FooBuzzBar");
        given(request.getRequestDispatcher(anyString())).willReturn(requestDispatcher);

        //when
        couponServlet.doPost(request, response);

        //then
        then(request).should().setAttribute(eq("discount"), eq("Discount for coupon FooBuzzBar is 50%"));
        then(request).should().getRequestDispatcher(eq("response.jsp"));
        then(requestDispatcher).should().forward(eq(request), eq(response));

    }
}