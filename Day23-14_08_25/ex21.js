var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var num = new Box(256);
console.log(num.getValue());
var str = new Box("Jayasree");
console.log(str.getValue());
