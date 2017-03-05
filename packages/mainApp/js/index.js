"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var subModule_1 = require("subModule");
//var kotlin = require("kotlinModule");
var scala = require("scalaModule");
scala.subscribe(js => console.log(js.echo()))

scala.appUsecase.updateText("hoge")
scala.main();


//console.log(scala);
//console.log(scala.calc(900));
//console.log(scala)
//console.log(kotlin);
//console.log(kotlin.doubling(200));
//console.log(subModule_1.default(100));
