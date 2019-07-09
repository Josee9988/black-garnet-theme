<?php
// This is a comment
class car {
    var $wheels;
    var $color;
    var $engine;

    function __construct() {
        $this->wheels = 4;
        $this->color = "red";
        $this->engine = 4200;
    }
    function functionName() {
        global $myint;
        if (true) {
            print("Hi");
        }
        return true;
    }
}

$ferrari = new car();
$ferrari->functionName();
?>