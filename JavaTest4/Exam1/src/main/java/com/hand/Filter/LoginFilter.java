package com.hand.Filter;


import com.hand.conntroller.Testcontroller;
import com.hand.model.Customer;
import com.hand.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/filter/*",filterName ="loginfilter" )
public class LoginFilter implements Filter {
    @Autowired
    private CustomerService customerService;

//容器加载的时候使用
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
      System.out.println("init loginFilter");
    }
//请求被拦截的时候调用
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         System.out.println("dofilter loginfiler");
        HttpServletRequest req=(HttpServletRequest) servletRequest;
        HttpServletResponse resp=(HttpServletResponse) servletResponse;

            String username=req.getParameter("username");
            String password=req.getParameter("password");
            System.out.println(username+"*************************************************");
            System.out.println(password+"--------------------------------------------------");


        Customer customer = new Customer();
        Customer customer1 = new Customer();
        customer.setFirstName(username);
        System.out.println(customer.getFirstName()+"=======================");
        customer1=customerService.select(customer);
        String aa=null;
        String bb=null;
        if(customer1!=null)

        {
            System.out.println(customer1.getFirstName() + "$$$$$$$$$$$" + customer1.getLastName());
            System.out.println(password+"++++++++++++++++++++++++++++++");
             bb = customer1.getLastName();
             if(bb.equals(password))
                {   System.out.println("5555555555555555555555555555555555");
                    resp.sendRedirect("/addsuccess");
                 }
             else {
                 resp.sendRedirect("/addfail");
                 return;
             }
        }
      else{
            resp.sendRedirect("/addfail");
                return;
        }

       // filterChain.doFilter(servletRequest,servletResponse);
    }
//容器销毁的时候调用
    @Override
    public void destroy() {
        System.out.println("destory loginFilter");

    }
}
