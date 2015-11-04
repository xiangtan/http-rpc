package com.lyc.rpc.serialize;

import com.lyc.rpc.exception.RpcException;

/**
 * 将报文解析成对象
 * Created on 2015/8/17.
 */
public interface Parser
{
    /**
     *
     * @param param 请求参数
     * @return
     */
    Request reqParse(String param) throws RpcException;

    /**
     *
     * @param result
     * @return
     */
    public <T> T rsbParse(String result);
}
