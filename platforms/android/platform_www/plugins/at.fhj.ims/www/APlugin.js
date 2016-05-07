cordova.define("at.fhj.ims.APlugin", function(require, exports, module) {
var exec = require('cordova/exec');

function APlugin() { 
 console.log("APlugin.js: is created");
}

APlugin.prototype.showToast = function(aString){
 console.log("A Plugin.js: showToast");

 exec(function(result){
     /*alert("OK" + reply);*/
   },
  function(result){
    /*alert("Error" + reply);*/
   },"APlugin",aString,[]);
}

APlugin.prototype.orientationGet = function(orientationString){
 console.log("A Plugin.js: ORIENTATION GET");

 exec(function(result){
     /*alert("OK" + reply);*/
   },
  function(result){
    /*alert("Error" + reply);*/
   },"APlugin",orientationString,[]);
}

 var APlugin = new APlugin();
 module.exports = APlugin;

});
