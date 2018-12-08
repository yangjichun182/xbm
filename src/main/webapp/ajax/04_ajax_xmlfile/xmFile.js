window.onload = function(){
	var xhr = ajaxFunction();
	
	xhr.onreadystatechange = function(){
		if(xhr.readyState==4){
			if(xhr.status==200){
				var docXml = xhr.responseXML;
				
				//利用alert()方法,进行测试数据内容:满足不了
				//alert(data);
				
				//console是Firebug的控制台,info就是打印信息
				//console.info(data);
				
				//解析XML内容
				var provinceXmlElements = docXml.getElementsByTagName("province");
				
				for(var i=0;i<provinceXmlElements.length;i++){
					var provinceXmlElement = provinceXmlElements[i];
					
					var provinceXmlValue = provinceXmlElement.getAttribute("name");
					
					//<option value="">请选择....</option>
					var option = document.createElement("option");
					option.setAttribute("value",provinceXmlValue);
					var text = document.createTextNode(provinceXmlValue);
					option.appendChild(text);
					
					var provinceElement = document.getElementById("province");
					
					provinceElement.appendChild(option);
					
				}
				
				//select标签的事件,option标签本身不具备任何事件内容
				document.getElementById("province").onchange = function(){
					//清空城市下拉列表
					var cityElement = document.getElementById("city");
					var options = cityElement.getElementsByTagName("option");
					//javascript的数组长度是可变的
//					for(var z=1;z<options.length;z++){
//						cityElement.removeChild(options[z]);
//						z--;
//					}
					
					for(var z=options.length-1;z>0;z--){
						cityElement.removeChild(options[z]);
					}
					
					//1 页面选中哪个省份
					var provinceValue = this.value;
					
					//2 解析XML内容
					//3 获取到XML内容中所有的province信息
					//4 遍历province信息
					for(var i=0;i<provinceXmlElements.length;i++){
						var provinceXmlElement = provinceXmlElements[i];
						
						//5 获取每一个省份信息
						var provinceXmlValue = provinceXmlElement.getAttribute("name");
					
						//6 页面选中省份==解析获取的省份
						if(provinceValue==provinceXmlValue){
							//7 将对应省份下的所有城市读取出来
							var cityXmlElements = provinceXmlElement.getElementsByTagName("city");
							
							for(var j=0;j<cityXmlElements.length;j++){
								var cityXmlElement = cityXmlElements[j];
								
								var cityXmlValue = cityXmlElement.firstChild.nodeValue;
								
								//<option value="">请选择....</option>
								var option = document.createElement("option");
								option.setAttribute("value",cityXmlValue);
								var text = document.createTextNode(cityXmlValue);
								option.appendChild(text);
								
								cityElement.appendChild(option);
								
							}
							
						}
					}
				}
				
			}
		}
	}
	
	xhr.open("get","/pactera/XmlFileServlet?timeStamp="+new Date().getTime(),true);
	
	xhr.send(null);
	
	function ajaxFunction(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }
	
		return xmlHttp;
	 }
}
