<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"> 
 
<head> 
	<meta http-equiv="Content-type" content="text/html; charset=utf-8" /> 
	<title>湖南省自来水公司营销管理信息系统</title> 
	
	<%@include file="../style.jsp" %>
	<style type="text/css">
	table.report th,table.report td { padding:10px; font-size:14px; }
	</style>
</head> 
 
<body> 

<div id="wrapper">
	
	<%@include file="../header.jsp" %>
	
	<div id="masthead">
		<div>
			<span id="pagetitle"><a href="javascript:;">各类用水统计总表</a></span>
			<span id="welcome_span">欢迎回来，马云</span>
		</div>
	</div> <!-- #masthead -->	
	
	<div id="content" class="xgrid" >

		<div class="x12">
			
			<h2>
				各类用水统计总表
				<div style="float:right;">
					<span style="color:#0000FF;">按月份统计</span>
					<a href="pay_reportWaterType1.html">按年份统计</a>
				</div>
			</h2>
			
			<div class="searchDiv">
				<div style="float:left;">
					统计年月 <select>
						<option>201402</option>
						<option>201401</option>
						<option>201312</option>
						<option>201311</option>
						<option>201310</option>
						<option>201309</option>
						<option>201308</option>
						<option>201307</option>
						<option>201306</option>
					</select>
				</div>
				
				<button class="btn btn-small btn-icon btn-find"><span></span>查询</button>
				<button class="btn btn-small btn-icon btn-star btn-blue"><span></span>计算</button>
			</div>
			
			<div>
				<div class="reportTitle">
					2014年02月各类用水统计总表
				</div>	
				<table class="report">
					<thead>
						<tr>
							<th width="60">序号</th>
							<th width="300">用水类型</th>
							<th width="140">水量</th>
							<th width="140">水价</th>
							<th width="180">水费</th>
							<th width="140">占比</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td class="center">1</td>
							<td class="left">居民用水</td>
							<td class="right">106913 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">143263.42 元</td>
							<td class="right">56.76%</td>
						</tr>
						<tr>
							<td class="center">2</td>
							<td class="left">行政用水</td>
							<td class="right">33418 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">44780.32 元</td>
							<td class="right">17.74%</td>
						</tr>
						<tr>
							<td class="center">3</td>
							<td class="left">工业用水</td>
							<td class="right">14310 吨</td>
							<td class="right">1.34 元/吨</td>
							<td class="right">21036.88 元</td>
							<td class="right">7.60%</td>
						</tr>
						<tr>
							<td class="center">4</td>
							<td class="left">经营用水</td>
							<td class="right">32452 吨</td>
							<td class="right">1.47 元/吨</td>
							<td class="right">78209.32 元</td>
							<td class="right">17.23%</td>
						</tr>
						<tr>
							<td class="center">5</td>
							<td class="left">特种用水</td>
							<td class="right">1251 吨</td>
							<td class="right">2.41 元/吨</td>
							<td class="right">6706.16 元</td>
							<td class="right">0.66%</td>
						</tr>
						<tr>
							<td class="center">6</td>
							<td class="left">混合用水</td>
							<td class="right">0 吨</td>
							<td class="right">5.36 元/吨</td>
							<td class="right">0.00 元</td>
							<td class="right">0.00%</td>
						</tr>
						<tr>
							<td class="center">7</td>
							<td class="left">合计水量</td>
							<td class="right">188344 吨</td>
							<td class="right">合计水费</td>
							<td class="right">293996.10 元</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">8</td>
							<td class="left">本月综合水价</td>
							<td class="right">1.56 元/吨</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">9</td>
							<td class="left">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">10</td>
							<td class="left">居民生活垃圾处理费</td>
							<td class="right">21382.60 元</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">11</td>
							<td class="left">水资源费</td>
							<td class="right">3766.9 元</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">12</td>
							<td class="left">污水处理费</td>
							<td class="right">75334.62 元</td>
							<td class="right">总应收</td>
							<td class="right">100484.12 元</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">13</td>
							<td class="left">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">14</td>
							<td class="left">本月应抄户数</td>
							<td class="right">4729 户</td>
							<td class="right">本月实抄户数</td>
							<td class="right">4729 户</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">15</td>
							<td class="left">抄表率</td>
							<td class="right">100%</td>
							<td class="right">报停用户总数</td>
							<td class="right">81 户</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">16</td>
							<td class="left">本月水厂出水量</td>
							<td class="right">&nbsp;</td>
							<td class="right">本月抄回水量</td>
							<td class="right">188345 吨</td>
							<td class="right">&nbsp;</td>
						</tr>
						<tr>
							<td class="center">17</td>
							<td class="left">抄回率</td>
							<td class="right">%</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
							<td class="right">&nbsp;</td>
						</tr>
					</tbody>
				</table>
			</div>
		</div> <!-- .x12 -->
		
	</div> <!-- #content -->
	
	<div id="footer">		
		<div class="content_pad">			
			<p>&copy; 2013-11 版权所有 <a href="#">湖南省自来水公司</a>.   技术支持 <a href="#">华瑞教育</a>.</p>
		</div> <!-- .content_pad -->
	</div> <!-- #footer -->
	
</div> <!-- #wrapper -->

<script src="../js/jquery/jquery-1.5.2.min.js"></script>
<script src="../js/jquery/jquery-ui-1.8.12.custom.min.js"></script>
<script src="../js/misc/excanvas.min.js"></script>
<script src="../js/jquery/facebox.js"></script>
<script src="../js/jquery/jquery.visualize.js"></script>
<script src="../js/jquery/jquery.dataTables.min.js"></script>
<script src="../js/jquery/jquery.tablesorter.min.js"></script>
<script src="../js/jquery/jquery.uniform.min.js"></script>
<script src="../js/jquery/jquery.placeholder.min.js"></script>

<script src="../js/widgets.js"></script>
<script src="../js/dashboard.js"></script>
<script src="../My97DatePicker/WdatePicker.js"></script>

<script type="text/javascript">
	
$(document).ready ( function () 
{
	Dashboard.init ();
	
});


</script>

</body> 
 
</html>