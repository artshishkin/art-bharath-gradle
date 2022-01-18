package net.shyshkin.study.gradle;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import java.io.PrintWriter;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.then;

@ExtendWith(MockitoExtension.class)
class UserServletTest {

    @Mock
    HttpServletRequest request;

    @Mock
    HttpServletResponse response;

    @Mock
    PrintWriter printWriter;

    @InjectMocks
    UserServlet userServlet;

    @Test
    void doPost() throws IOException, ServletException {
        //given
        given(request.getParameter(anyString())).willReturn("Art");
        given(response.getWriter()).willReturn(printWriter);

        //when
        userServlet.doPost(request, response);

        //then
        then(request).should().getParameter(eq("username"));
        then(printWriter).should().print(eq("Hello Art"));

    }
}