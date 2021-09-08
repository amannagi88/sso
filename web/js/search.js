/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var coordinates = {longitude:'',latitude:''};

$.ajax({
    url: "https://geolocation-db.com/jsonp",
    jsonpCallback: "callback",
    dataType: "jsonp",
    success: function (location) {
        //debugger;
        coordinates.latitude = location.latitude;
        coordinates.longitude = location.longitude;

    }
});


function _open__search(a, b) {
    var experience = $('.exp-sel:checkbox:checked').map(function () {
        return this.value;
    }).get();
    var rating = $('.rat-sel:checkbox:checked').map(function () {
        return this.value;
    }).get();
    var surgery = $('.sur-sel:checkbox:checked').map(function () {
        return this.value;
    }).get();
    var spec = $('.spec-sel').val();
    $("#__search_result").load(contextPath + "/service.do?Method=filter",
    {
        'experience': experience.join(","),
        'rating': rating.join(","),
        'surgery': surgery.join(","),
        'specialization': spec!=null?spec.join(","):'',
        'longitude': coordinates.longitude,
        'latitude' : coordinates.latitude
    },
    function (responseTxt, statusTxt, xhr) {

    });
}

function _open__detail(a) {    
    $(".docDtl").load(contextPath + "/service.do?Method=doctorDetails",
    {
        'doctorId': a
    },
    function (responseTxt, statusTxt, xhr) {

    });
}