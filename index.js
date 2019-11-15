Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore

@Nicolas951120
Learn Git and GitHub without any code!
Using the Hello World guide, you’ll start a branch, write comments, and open a pull request.


4
21duty-os/white-demo-web
 Code Issues 0 Pull requests 0 Actions Projects 0 Wiki Security Insights
white-demo-web/quickStart/2.0/index.js
@Moskize91 Moskize91 refactor: split into 1.0 & 2.0
2860e8a on 22 Feb
29 lines (26 sloc)  1 KB

var whiteWebSdk = new WhiteWebSdk();
var miniToken = 'WHITEcGFydG5lcl9pZD1DYzlFNTJhTVFhUU5TYmlHNWJjbkpmVThTNGlNVXlJVUNwdFAmc2lnPTE3Y2ZiYzg0ZGM5N2FkNDAxZmY1MTM0ODMxYTdhZTE2ZGQ3MTdmZjI6YWRtaW5JZD00JnJvbGU9bWluaSZleHBpcmVfdGltZT0xNTY2MDQwNjk4JmFrPUNjOUU1MmFNUWFRTlNiaUc1YmNuSmZVOFM0aU1VeUlVQ3B0UCZjcmVhdGVfdGltZT0xNTM0NDgzNzQ2Jm5vbmNlPTE1MzQ0ODM3NDYzMzYwMA';

var url = 'https://cloudcapiv4.herewhite.com/room?token=' + miniToken;
var requestInit = {
    method: 'POST',
    headers: {
        "content-type": "application/json",
    },
    body: JSON.stringify({
        name: '我的第一个 White 房间',
        limit: 100, // 房间人数限制
    }),
};

fetch(url, requestInit)
    .then(function(response) {
        return response.json();
    })
    .then(function(json) {
        return whiteWebSdk.joinRoom({
            uuid: json.msg.room.uuid,
            roomToken: json.msg.roomToken,
        });
    })
    .then(function(room) {
        room.bindHtmlElement(document.getElementById('whiteboard'));
    });
© 2019 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
