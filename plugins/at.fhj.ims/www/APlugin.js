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

 var APlugin = new APlugin();
 module.exports = APlugin;
