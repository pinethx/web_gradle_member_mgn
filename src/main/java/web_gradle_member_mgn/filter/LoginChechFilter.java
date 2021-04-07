package web_gradle_member_mgn.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/admin/*")
public class LoginChechFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession();
		
		System.out.println("doFilter >> ");
		System.out.println("contextPath >> "+httpRequest.getContextPath());
		if (session != null && session.getAttribute("id") != null) {
			chain.doFilter(request, response);
		} else {
			((HttpServletResponse)response).sendRedirect(httpRequest.getContextPath()+"/loginForm.jsp");
//			httpRequest.getRequestDispatcher(httpRequest.getContextPath() + "loginForm.jsp").forward(httpRequest, response);
		}
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
