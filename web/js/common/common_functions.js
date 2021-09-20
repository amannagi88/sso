/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


function submitFormNormal(formOb) {
    var button = formOb.ownerDocument.createElement('input');
    button.style.display = 'none';
    button.type = 'submit';
    formOb.appendChild(button).click();
    formOb.removeChild(button);
    //var acVal = formOb.action;
    //if (!(acVal).includes("Export") && !(acVal).includes("_DTView")) {
    //  LoadPopUp();
    //}
}