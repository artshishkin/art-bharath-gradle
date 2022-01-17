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
    void doGet() throws IOException, ServletException {
        //given
        var couponServlet = new CouponServlet();
        given(response.getWriter()).willReturn(printWriter);

        //when
        couponServlet.doGet(request, response);

        //then
        then(printWriter).should().print(eq("SUPERSALE"));
    }

    @Test
    void doPost() {
        //given

        //when

        //then

    }
}