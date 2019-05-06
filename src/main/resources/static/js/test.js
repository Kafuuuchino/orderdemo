$(document).ready(function(){
    $("#btn").click(function () {
        $.ajax({
            type:'post',
            url:'/order/test1',
            data:JSON.stringify({
                "shopOrderCode": 1557061087348,
                "shopOrderRemarks": "1",
                "shopOrderUser": "3cbec27d0590496784d7f93812ff7d13",
                "shopOrderTotalprice": 66,
                "shopOrderStatus": 0,
                "shopOrderName": "æµ\u008bè¯\u0095ç\u0094¨æ\u0088·å\u0090\u008då\u00ad\u0097",
                "shopOrderCompanyid": "8f1f3db1de77436191548727ae711737",
                "shopRecordList": [
                    {
                        "shopRecordSparesId": "1554427346816",
                        "shopRecordPrice": "18",
                        "shopRecordNumber": "1",
                        "shopRecordUnit": "ä¸ª",
                        "shopRecordDiscount": "0",
                        "mealId": "",
                        "shopRecordActualprice": 18
                    },
                    {
                        "shopRecordSparesId": "1554427440017",
                        "shopRecordPrice": "18",
                        "shopRecordNumber": "1",
                        "shopRecordUnit": "ä¸ª",
                        "shopRecordDiscount": "0",
                        "mealId": "",
                        "shopRecordActualprice": "18"
                    },
                    {
                        "shopRecordSparesId": "1554443183677",
                        "shopRecordPrice": "15",
                        "shopRecordNumber": "2",
                        "shopRecordUnit": "ä¸ª",
                        "shopRecordDiscount": "0",
                        "mealId": "",
                        "shopRecordActualprice": "15"
                    }
                ],
                "shopOrderUserCard": ""
            }),
            contentType:"application/json;charset=UTF-8",
            success:function(data){
                console.log(data);
            }
        });
    });

});