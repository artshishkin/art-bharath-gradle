package net.shyshkin.study.gradle;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

    @Test
    void doGet_Art() throws IOException, ServletException {
        //given
        var couponServlet = new CouponServlet();
        given(response.getWriter()).willReturn(printWriter);

        //when
        couponServlet.doGet(request, response);

        //then
        then(printWriter).should().print(eq("SUPERSALE"));
    }

    @Test
    void doGet_Bharath() throws IOException, ServletException {
        //given
        var couponServlet = new CouponServlet();

        StringWriter stringWriter = new StringWriter();
        var printWriter = new PrintWriter(stringWriter);

        given(response.getWriter()).willReturn(printWriter);

        //when
        couponServlet.doGet(request, response);

        //then
        assertEquals("SUPERSALE", stringWriter.toString());
    }

    @Test
    void doPost() {
        //given

        //when

        //then

    }
}