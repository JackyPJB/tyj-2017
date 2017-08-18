<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>待激活设备列表</title>
    </head>
    <body>
        <table id="list"></table>
        <div id="toolbar">
            <b>关键字：</b>
            <input class="easyui-textbox" type="text" id="keyword" name="keyword" data-options="prompt:'姓名/车牌/微信号'" size="30" />
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-search'" onclick="doSearch()">查询</a>
            <auth:auth test="to_activate/activate">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doEdit()">激活</a>
            </auth:auth>
            <auth:auth test="to_activate/debug">
            <a href="javascript:void(0)" class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="doTest()">调试</a>
            </auth:auth>
        </div>
        <div id="a" class="easyui-window" title="设置激活时间" data-options="closed:true," style="width:300px;height:140px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="af" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="deviceId"/>
                            <tr>
                                <td>激活时间:</td>
                                <td><input class="easyui-my97" type="text" name="testTIme" data-options="skin:'whyGreen',minDate:'%y-%M-{%d}',dateFmt:'yyyy-MM-dd HH:mm:ss',width:120"></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#af'), 'activate', $('#a'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#a'));clearForm($('#af'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
        <div id="e" class="easyui-window" title="核对信息" data-options="closed:true," style="width:500px;height:420px;padding:1px;">
            <div class="easyui-layout" data-options="fit:true">
                <div data-options="region:'center'" style="padding:10px;">
                    <form id="ef" class="easyui-form">
                        <table cellpadding="5">
                            <input type="hidden" name="deviceId"/>
                            <tr>
                                <td>姓名:</td>
                                <td><input class="easyui-textbox" type="text" name="name" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>车牌号:</td>
                                <td><input class="easyui-textbox" type="text" name="plateNo" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>车型:</td>
                                <td><input class="easyui-combobox" id="ecarType" name="carType" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>设备SIM卡号:</td>
                                <td><input class="easyui-textbox" type="text" name="phoneOfDevice" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>微信账号:</td>
                                <td><input class="easyui-textbox" type="text" name="weixinAccount" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>过期时间:</td>
                                <td><input class="easyui-textbox" type="text" name="outofdateTime" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>激活状态:</td>
                                <td><input class="easyui-textbox" type="text" name="status" data-options="readonly:true"/></td>
                            </tr>
                            <tr>
                                <td>激活时限:</td>
                                <td><input class="easyui-combobox" id="eActivateType" name="activateType" data-options="readonly:true"/></td>
                            </tr>
                        </table>
                    </form>
                </div>
                <div data-options="region:'south',border:false" style="text-align:right;padding:5px 0 0;">
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-ok'" href="javascript:void(0)" onclick="submitForm($('#ef'), 'activate', $('#e'));" style="width:80px">提交</a>
                    <a class="easyui-linkbutton" data-options="iconCls:'icon-cancel'" href="javascript:void(0)" onclick="closeWindow($('#e'));clearForm($('#ef'));" style="width:80px">关闭</a>
                </div>
            </div>
        </div>
    </body>
</html>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/to_activate_model.js"></script>
<script type="text/javascript" src="<c:url value="/"/>js/page/deviceInfo/to_activate_action.js"></script>
