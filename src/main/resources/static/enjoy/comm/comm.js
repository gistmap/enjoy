function isEmpty(str) {
    if ( str.length == 0 || isEmpty(str) ){
        return true;
    }
    return false;
}

function makeJson() {
    var d = {};
    for (var i = 0; i < arguments.length; i++)
    {
        d.arguments[i].name = arguments[i];
    }
    return d;
}