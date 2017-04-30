<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--Spring URL Start-->
<c:url value="/tabel" var="tabel"/>
<c:url value="/siswa" var="siswa"/>
<!--Spring Url End-->
<aside class="main-sidebar">
    <section class="sidebar">
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="header">MAIN NAVIGATION</li>
            <%--Macam-macam menu sidebar(tinggal pilih)--%>
            <%--<li class="treeview">--%>
            <%--<a href="#">--%>
            <%--<i class="fa fa-edit"></i> <span>Forms</span>--%>
            <%--<span class="pull-right-container">--%>
            <%--<i class="fa fa-angle-left pull-right"></i>--%>
            <%--</span>--%>
            <%--</a>--%>
            <%--<ul class="treeview-menu">--%>
            <%--<li><a href="pages/forms/general.html"><i class="fa fa-circle-o"></i> General Elements</a></li>--%>
            <%--<li><a href="pages/forms/advanced.html"><i class="fa fa-circle-o"></i> Advanced Elements</a></li>--%>
            <%--<li><a href="pages/forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>--%>
            <%--</ul>--%>
            <%--</li>--%>
            <li class="treeview">
                <a href="#">
                    <i class="fa fa-table"></i> <span>Tables</span>
                    <span class="pull-right-container">
                        <i class="fa fa-angle-left pull-right"></i>
                    </span>
                </a>
                <ul class="treeview-menu">
                    <li><a href="${tabel}"><i class="fa fa-circle-o"></i> Simple tables</a></li>
                    <li><a href="${siswa}"><i class="fa fa-circle-o"></i> Siswa</a></li>
                </ul>
            </li>
            <%--<li class="treeview">--%>
            <%--<a href="#">--%>
            <%--<i class="fa fa-share"></i> <span>Multilevel</span>--%>
            <%--<span class="pull-right-container">--%>
            <%--<i class="fa fa-angle-left pull-right"></i>--%>
            <%--</span>--%>
            <%--</a>--%>
            <%--<ul class="treeview-menu">--%>
            <%--<li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>--%>
            <%--<li>--%>
            <%--<a href="#"><i class="fa fa-circle-o"></i> Level One--%>
            <%--<span class="pull-right-container">--%>
            <%--<i class="fa fa-angle-left pull-right"></i>--%>
            <%--</span>--%>
            <%--</a>--%>
            <%--<ul class="treeview-menu">--%>
            <%--<li><a href="#"><i class="fa fa-circle-o"></i> Level Two</a></li>--%>
            <%--<li>--%>
            <%--<a href="#"><i class="fa fa-circle-o"></i> Level Two--%>
            <%--<span class="pull-right-container">--%>
            <%--<i class="fa fa-angle-left pull-right"></i>--%>
            <%--</span>--%>
            <%--</a>--%>
            <%--<ul class="treeview-menu">--%>
            <%--<li><a href="${tabel}"><i class="fa fa-circle-o"></i> Level Threes</a></li>--%>
            <%--<li><a href="${tabel}"><i class="fa fa-circle-o"></i> Level Threes</a></li>--%>
            <%--</ul>--%>
            <%--</li>--%>
            <%--</ul>--%>
            <%--</li>--%>
            <%--<li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>--%>
            <%--</ul>--%>
            <%--</li>--%>
        </ul>
    </section>
    <!-- /.sidebar -->
</aside>