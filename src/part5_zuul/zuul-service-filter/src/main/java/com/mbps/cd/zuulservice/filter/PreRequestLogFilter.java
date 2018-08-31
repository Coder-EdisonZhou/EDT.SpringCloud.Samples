package com.mbps.cd.zuulservice.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

/**
 * @project: part5_zuul
 * @description:
 * @author: Edison Zhou
 * @create: 2018-08-29
 **/
public class PreRequestLogFilter extends ZuulFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(PreRequestLogFilter.class);

    // 返回过滤器的类型
    // 可选项：pre, route, post, error
    @Override
    public String filterType() {
        return "pre";
    }

    // 返回一个int值来指定过滤器的执行顺序
    // 不同的过滤器允许返回相同的数字
    @Override
    public int filterOrder() {
        return 1;
    }

    // 返回一个boolean值来判断该过滤器是否要执行
    @Override
    public boolean shouldFilter() {
        return true;
    }

    // 过滤器具体逻辑
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        PreRequestLogFilter.LOGGER.info(String.format("send %s request to %s",
                request.getMethod(),
                request.getRequestURL().toString()));

        return null;
    }
}
