var pathName=window.document.location.pathname;
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
var char3="<script language=javascript src='"+projectName+"/js/Chart3.0.js' ></script>";
var jquery="<script language=javascript src='"+projectName+"/js/jquery.min.js'></script>";
var bootstrap="<script language=javascript src='"+projectName+"/bootstrap/js/bootstrap.min.js' ></script>";
var mainjs="<script language=javascript src='"+projectName+"/js/main.js' ></script>";
document.write(jquery);
document.write(char3);
document.write(bootstrap);
document.write(mainjs);

var mybarcss="<link rel=stylesheet type=text/css href='"+projectName+"/css/mybar.css'/>";
var bootstrapcss="<link rel=stylesheet type=text/css href='"+projectName+"/bootstrap/css/bootstrap.css'/>";
var boottheme="<link rel=stylesheet type=text/css href='"+projectName+"/bootstrap/css/bootstrap-theme.css'/>";
document.write(mybarcss);
document.write(bootstrapcss);
document.write(boottheme);
