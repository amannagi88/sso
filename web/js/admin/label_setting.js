/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function submitForm() {
    var v1 = null;
    var v2 = null;
    var div = null;
    var err = 0;
    var len = document.getElementById("datalen").value;
    for (var i = 0; i < len; i++) {
        v1 = document.getElementById("orderVal" + i);
        div = document.getElementById("orderDiv" + i);
        for (var j = 0; j < len; j++) {
            v2 = document.getElementById("orderVal" + j);
            if (i != j && v1 != null && v2 != null && v1.value == v2.value && div != null) {
                err++;
                div.style.background = "red";
                break;
            } else if (div != null) {
                div.style.background = "";
            }
        }
    }
    if (err > 0) {
        alert("Display order can not match with other fields");
    } else {
        submitFormNormal(document.getElementById("form123"));
    }
}
var OV = null;
function SaveOnChange(ob) {
    OV = ob.value;
}
function CheckOnChanges(i) {
    var NV = document.getElementById("orderVal" + i).value;
    var v2 = null;
    var len = document.getElementById("datalen").value;
    for (var j = 0; j < len; j++) {
        v2 = document.getElementById("orderVal" + j);
        if (i != j && parseInt(OV) > parseInt(NV) && v2 != null && parseInt(v2.value) >= parseInt(NV) && parseInt(v2.value) <= parseInt(OV)) {
            v2.value = parseInt(v2.value) + 1;
        }
        if (i != j && parseInt(OV) < parseInt(NV) && v2 != null && parseInt(v2.value) <= parseInt(NV) && parseInt(v2.value) >= parseInt(OV)) {
            v2.value = parseInt(v2.value) - 1;
        }
    }
}
function selectAllCheckMand(ob) {
    var chk = null;
    var len = document.getElementById("datalen").value;
    for (var i = -5; i < len; i++) {
        chk = document.getElementById("isMandatoryVal" + i);
        if (ob.checked && chk != null && chk.disabled != true) {
            chk.checked = true;
        } else if (chk != null && chk.disabled != true) {
            chk.checked = false;
        }
    }
}
function selectAllCheckAppl(ob) {
    var chk = null;
    var len = document.getElementById("datalen").value;
    for (var i = -5; i < len; i++) {
        chk = document.getElementById("isApplicableVal" + i);
        if (ob.checked && chk != null && chk.disabled != true) {
            chk.checked = true;
        } else if (chk != null && chk.disabled != true) {
            chk.checked = false;
        }
    }
}

