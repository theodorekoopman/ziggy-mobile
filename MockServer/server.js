var express = require('express')
var app = express()
var fs = require('fs')

app.use(function(req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
  next();
});

app.get('/hello', function (req, res) {
    res.send('Hello World!')
})

app.get('/api/login', function (req, res) {
    var filename = "./profile.json";
    fs.readFile(filename, 'utf8', function (err, data) {
        if (err) throw err;
        //console.log('OK: ' + filename);
        console.log(data)
        res.send(data);
    });

})

app.listen(3000, function () {
    console.log('Example app listening on port 3000!')
})