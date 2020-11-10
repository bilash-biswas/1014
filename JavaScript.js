var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var A = parseInt(lines.shift());
var B = parseFloat(lines.shift());
console.log((A / B).toFixed(3)+" km/l");
