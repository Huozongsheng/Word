<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>文件上传</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link href="http://cdn.bootcss.com/bootstrap-fileinput/4.3.9/css/fileinput.min.css" rel="stylesheet">
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://cdn.bootcss.com/bootstrap-fileinput/4.3.9/js/fileinput.min.js"></script>
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>

</head>
<body>
<h2>分词</h2>
<div class="container">
    <div class="panel panel-info">
        <div class="panel-heading">
            <h3 class="panel-title">
                文件上传
            </h3>
        </div>
        <div class="panel-body">
            <input id="fileid" name="fileid" type="file" multiple
                   class="file-loading" height="200" width="200" required="required">
        </div>
        <div class="panel-footer">
            选择文件进行上传
        </div>
    </div>
</div>
<script>
    $(document).on('ready', function () {
        $("#fileid").fileinput(
            {
                language: 'zh',
                uploadUrl: '/analyze/upload',
                maxFileCount: 1,//表示允许同时上传的最大文件个数
                showCaption: true,//是否显示标题
                browseClass: "btn btn-primary", //按钮样式
                dropZoneEnabled: false,//是否显示拖拽区域
                uploadAsync: true,
                showUpload: true,
                showRemove: true,
                maxFileSize: 10485,//单位为kb，如果为0表示不限制文件大小
                minFileSize: 50,
                minFileCount: 1,
                enctype: 'multipart/form-data',
                previewFileIcon: "<i class='glyphicon glyphicon-king'></i>",
                msgFilesTooMany: "不能超过1个文件！",
                allowedFileExtensions: ["txt"]
            });
    });
</script>
<script>
    $("#fileid").on("fileuploaded", function(event, data, previewId, index) {
        alert("上传成功");
        window.location.href="/analyze/learnStopWord";
    });
</script>
</body>
</html>
