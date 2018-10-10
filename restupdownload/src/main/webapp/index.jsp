<html>
   <head>
      <title>Start Page</title>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   </head>
   <body>
      <h1>REST Upload demo</h1>
      <form method="post" action="rest/demo/upload" enctype="multipart/form-data">
         <input type="hidden" name="action" value="upload" />
         <label>Load your file:</label>
         <input type="file" name="attachment" />
         <br />
         <input type="submit" value="Upload file" />
      </form>
   </body>
</html>