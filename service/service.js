
let unusedVariable = 'This variable is unused';


function functionWithTooManyParams(param1, param2, param3, param4, param5, param6) {
    return param1 + param2 + param3 + param4 + param5 + param6;
}


let condition = true;
if (condition = true) { 
    console.log('Condition is true');
}


function unusedFunction() {
    console.log('This function is never called');
}


try {
    throw new Error('Something went wrong');
} catch (error) {
    
}


function functionWithUnusedParam(usedParam, unusedParam) {
    return usedParam;
}


let num = 10;
let message = 'The number is ' + num; 


undeclaredVariable = 'This variable is not declared properly';


let evalString = 'alert("Hello!")';
eval(evalString);


let inefficientRegex = /^.*$/;


function useArgumentsObject() {
    console.log(arguments);
}


function unreachableCode() {
    return true;
    console.log('This line is unreachable');
}


let funcConstructor = new Function('a', 'b', 'return a + b');


let obj = { x: 10, y: 20 };
with (obj) {
    console.log(x + y);
}


let numString = '10';
let parsedNum = parseInt(numString); 


let value1 = '10';
let value2 = 10;
if (value1 == value2) {
    console.log('Values are equal');
}

let array = new Array();
