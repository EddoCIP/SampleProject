<%-- 
    Document   : layout
    Created on : 24-Dec-2016, 14:41:42
    Author     : gsp
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>AdminLTE 2 | Dashboard</title>
        <!-- Tell the browser to be responsive to screen width -->
        <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <!-- Bootstrap 3.3.6 -->
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>"/>
        <!-- Font Awesome -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
        <!-- Ionicons -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
        <!-- Theme style -->
        <link rel="stylesheet" href="<c:url value="/resources/css/AdminLTE.min.css"/>"/>
        <!-- AdminLTE Skins. Choose a skin from the css/skins
             folder instead of downloading all of them to reduce the load. -->
        <link rel="stylesheet" href="<c:url value="/resources/css/_all-skins.min.css"/>"/>
        <!-- iCheck -->
        <link rel="stylesheet" href="<c:url value="/resources/css/blue.css"/>"/>
        <!-- Morris chart -->
        <link rel="stylesheet" href="<c:url value="/resources/css/morris.css"/>"/>
        <!-- jvectormap -->
        <link rel="stylesheet" href="<c:url value="/resources/css/jquery-jvectormap-1.2.2.css"/>"/>
        <!-- Date Picker -->
        <link rel="stylesheet" href="<c:url value="/resources/css/datepicker3.css"/>"/>
        <!-- Daterange picker -->
        <link rel="stylesheet" href="<c:url value="/resources/css/daterangepicker.css"/>"/>
        <!-- bootstrap wysihtml5 - text editor -->
        <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap3-wysihtml5.min.css"/>"/>
        <!--JavaScript-->
        <script src="<c:url value="/resources/js/jquery-2.2.3.min.js"/>"></script>
        <!-- jQuery UI 1.11.4 -->
        <script src="https://code.jquery.com/ui/1.11.4/jquery-ui.min.js"></script>
        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
        <script>
            $.widget.bridge('uibutton', $.ui.button);
        </script>
        <!-- Bootstrap 3.3.6 -->
        <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
        <!-- Morris.js charts -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="<c:url value="/resources/js/morris.min.js"/>"></script>
        <!-- Sparkline -->
        <script src="<c:url value="/resources/js/jquery.sparkline.min.js"/>"></script>
        <!-- jvectormap -->
        <script src="<c:url value="/resources/js/jquery-jvectormap-1.2.2.min.js"/>"></script>
        <script src="<c:url value="/resources/js/jquery-jvectormap-world-mill-en.js"/>"></script>
        <!-- jQuery Knob Chart -->
        <script src="<c:url value="/resources/js/jquery.knob.js"/>"></script>
        <!-- daterangepicker -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js"></script>
        <script src="<c:url value="/resources/js/daterangepicker.js"/>"></script>
        <!-- datepicker -->
        <script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>
        <!-- Bootstrap WYSIHTML5 -->
        <script src="<c:url value="/bootstrap3-wysihtml5.all.min.js"/>"></script>
        <!-- Slimscroll -->
        <script src="<c:url value="/resources/js/jquery.slimscroll.min.js"/>"></script>
        <!-- FastClick -->
        <script src="<c:url value="/resources/js/fastclick.js"/>"></script>
        <!-- AdminLTE App -->
        <script src="<c:url value="/resources/js/app.min.js"/>"></script>
        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->
        <script src="<c:url value="/resources/js/dashboard.js"/>"></script>
        <!-- AdminLTE for demo purposes -->
        <script src="<c:url value="/resources/js/demo.js"/>"></script>
    </head>
    <body class="hold-transition skin-blue sidebar-mini">
        <div class="wrapper">
            <tiles:insertAttribute name="header"/>
            <tiles:insertAttribute name="menu"/>
            <div class="content-wrapper">
                <tiles:insertAttribute name="body"/>    
            </div>
            <tiles:insertAttribute name="footer"/>
        </div>
    </body>
</html>
