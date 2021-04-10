// 设置参数 圆饼
    var data = {
        labels: [
            "Red",
            "Blue",
            "Yellow"
        ],
        datasets: [
            {
                data: [300, 50, 100],
                backgroundColor: [
                    "#FF6384",
                    "#36A2EB",
                    "#FFCE56"
                ],
                hoverBackgroundColor: [
                    "#FF6384",
                    "#36A2EB",
                    "#FFCE56"
                ]
            }]
    };

    // Get the context of the canvas element we want to select
    var ctx = document.getElementById("myChart").getContext("2d");
    var myPieChart = new Chart(ctx, {
        type: 'pie',
        data: data,
        // options: options
    });


// 矩形
    var data1 = {
        labels: ["一月", "二月", "三月", "四月", "五月", "六月", "七月",
            "八月", "九月", "十月", "十一月", "十二月"],
        datasets: [
            {
                label: "营销量",
                backgroundColor: "#FF6384",
                borderColor: "#FFCE56",
                data: [100, 200, 300, 100, 200, 300, 100, 200, 300, 100, 200, 300]
            }]
    };


// Get the context of the canvas element we want to select
    var myChart1 = document.getElementById("myChart1").getContext("2d");
    var myBarChart = new Chart(myChart1, {
        type: 'bar',
        data: data1
    });


// 曲线
    var data2 = {
        labels: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"
        ],
        /// 第一条线
        datasets: [
            {
                label: "利润额",
                backgroundColor: '#abcdef',
                borderColor: "#0066ee",
                hoverBorderColor: "#000000",
                hoverBackgroundColor: '#088ffe',
                hoverBorderColor: '#aaaaaa',
                data: [1202011, 59000, 90000, 81000, 56000, 55000, 400000, 80000, 59000, 90000, 81000, 56000]
            },
            /// 第二条线
            {
                label: "本金额",
                backgroundColor: '#aaaaaa',
                borderColor: "#EE7A4F",
                hoverBorderColor: "#d6ff63",
                hoverBackgroundColor: '#fe256f',
                hoverBorderColor: '#aa2293',
                data: [45000, 55000, 799900, 7977700, 44000, 21000, 230000, 54000, 36000, 45000, 45600, 12300]
            },
            /// 第三条线
            {
                label: "营业金额",
                backgroundColor: '#0d55aa',
                borderColor: "#cc11ee",
                hoverBorderColor: "#25ffa7",
                hoverBackgroundColor: '#fef1f6',
                hoverBorderColor: '#830caa',
                data: [67800, 88888, 95456, 78099, 78045, 225078, 7852011, 5552011, 2352011, 8552011, 4552011, 7852011]
            }
        ]

    };
/// 动画效果
    var options2 = {

        //Boolean - If we show the scale above the chart data
        scaleOverlay: false,

        //Boolean - If we want to override with a hard coded scale
        scaleOverride: false,

        //** Required if scaleOverride is true **
        //Number - The number of steps in a hard coded scale
        scaleSteps: null,
        //Number - The value jump in the hard coded scale
        scaleStepWidth: null,
        //Number - The scale starting value
        scaleStartValue: null,


        //Number - Pixel width of the scale line
        scaleLineWidth: 1,

        //Boolean - Whether to show labels on the scale
        scaleShowLabels: true,


        //String - Scale label font declaration for the scale label
        scaleFontFamily: "'Arial'",

        //Number - Scale label font size in pixels
        scaleFontSize: 12,

        //String - Scale label font weight style
        scaleFontStyle: "normal",


        ///Boolean - Whether grid lines are shown across the chart
        scaleShowGridLines: true,


        //Number - Width of the grid lines
        scaleGridLineWidth: 1,

        //Boolean - Whether the line is curved between points
        bezierCurve: true,

        //Boolean - Whether to show a dot for each point
        pointDot: true,

        //Number - Radius of each point dot in pixels
        pointDotRadius: 3,

        //Number - Pixel width of point dot stroke
        pointDotStrokeWidth: 1,

        //Boolean - Whether to show a stroke for datasets
        datasetStroke: true,

        //Number - Pixel width of dataset stroke
        datasetStrokeWidth: 2,

        //Boolean - Whether to fill the dataset with a colour
        datasetFill: true,

        //Boolean - Whether to animate the chart
        animation: true,

        //Number - Number of animation steps
        animationSteps: 60,

        //String - Animation easing effect
        animationEasing: "easeOutQuart",

        //Function - Fires when the animation is complete
        onAnimationComplete: null

    }

// Get the context of the canvas element we want to select
    var myChart2 = document.getElementById("myChart2").getContext("2d");
    var myBarChart = new Chart(myChart2, {
        type: 'line',
        data: data2,
        options: options2
    });

    function ajaxOn() {
        data.datasets[0].data = [523, 120, 999]
        myPieChart = new Chart(ctx, {
            type: 'pie',
            data: data,
        });
        data1.datasets[0].data = [888, 120, 999, 152, 1542, 744, 999, 1224, 7412, 6542, 1478, 1110]
        myBarChart = new Chart(myChart1, {
            type: 'bar',
            data: data1
        });
        data2.datasets[0].data = [88, 120, 999, 123, 1542, 744, 999, 1224, 7412, 6541, 1478, 630]
        data2.datasets[1].data = [888, 1880, 456, 561, 1542, 744, 852, 1224, 546, 6542, 452, 145]
        data2.datasets[2].data = [998, 2210, 234, 2222, 1542, 744, 1234, 1224, 7412, 6542, 1478, 2222]
        myBarChart2 = new Chart(myChart2, {
            type: 'line',
            data: data2
        });
    }


    function ajaxs(result) {
        // console.log(result.pie)
        // console.log(result.bar)
        // console.log(result.li1)
        // console.log(result.li2)
        // console.log(result.li3)

        var myChartdiv = $("#myChartdiv");
        //console.log(myChartdiv)
        //div.clear();
        //console.log(myChartdiv.children());
        var myChartdivchildren = myChartdiv.children();
        myChartdivchildren.remove();
        var canvas = $("<canvas>");
        canvas.attr("id", "myChart");
        myChartdiv.append(canvas);
        ctx = myChartdiv.children()[0].getContext("2d");
        data.datasets[0].data = result.pie;
        myPieChart = new Chart(ctx, {
            type: 'pie',
            data: data,
        });


        var myChart1tdiv = $("#myChart1tdiv");
        //console.log(myChartdiv)
        //div.clear();
        //console.log(myChartdiv.children());
        var myChart1tdivchildren = myChart1tdiv.children();
        myChart1tdivchildren.remove();
        var canvas1 = $("<canvas>");
        canvas1.attr("id", "myChart1");
        myChart1tdiv.append(canvas1);
        myChart1 = myChart1tdiv.children()[0].getContext("2d");

        data1.datasets[0].data = result.bar;
        myBarChart = new Chart(myChart1, {
            type: 'bar',
            data: data1
        });


        var myChart2tdiv = $("#myChart2tdiv");
        //console.log(myChartdiv)
        //div.clear();
        //console.log(myChartdiv.children());
        var myChart2tdivchildren = myChart2tdiv.children();
        myChart2tdivchildren.remove();
        var canvas2 = $("<canvas>");
        canvas2.attr("id", "myChart2");
        myChart2tdiv.append(canvas2);
        myChart2 = myChart2tdiv.children()[0].getContext("2d");

        data2.datasets[0].data = result.li1;
        data2.datasets[1].data = result.li2;
        data2.datasets[2].data = result.li3;
        myBarChart2 = new Chart(myChart2, {
            type: 'line',
            data: data2
        });
    }


    function clockquery() {
       var tockerns=$('#tockens').val();
        console.log("---------------------------");
       console.log(tockerns);
        $.ajax({
            type: 'POST',
            url: projectName + "/fw",
            data: {commond: 'ajaxdata',tocken:tockerns},
            async: true,
            success: function (result) {
                ajaxs(result);
            }
        });

    }

    var ff = self.setInterval("clockquery()", 5000);


    function f2() {
        clearInterval(ff);
    }

    function ffks() {
        ff = self.setInterval("clockquery()", 5000);
    }

