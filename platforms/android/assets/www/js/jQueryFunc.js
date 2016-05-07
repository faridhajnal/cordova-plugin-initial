$(function(){
            $("#button1").click(function(){
                    $(this).hide();
                    //APlugin.orientationGet();
                    console.log('everythin worked out');
                });

            $("#button2").click(function(){
                    $("#button1").show();
                });

            $("#landscapebtn").click(function(){
                    APlugin.orientationGet("Land");
                });

            $("#portraitbtn").click(function(){
                    APlugin.orientationGet("Port");
                });
});
