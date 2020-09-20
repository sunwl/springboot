var pathName=window.document.location.pathname;
var projectName=pathName.substring(0,pathName.substr(1).indexOf('/')+1);
var common="<script language=javascript src='"+projectName+"/js/common.js' ></script>";
document.write(common);

