function showtabs1(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub1_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub1_2';
        }
    }
}

function showtabs2(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub2_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub2_2';
        }
    }
}

function showtabs3(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub3_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub3_2';
        }
    }
}

function showtabs4(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub4_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub4_2';
        }
    }
}


function showtabs5(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub5_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub5_2';
        }
    }
}

function showtabs6(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub6_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub6_2';
        }
    }
}

function showtabs7(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub7_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub7_2';
        }
    }
}


function showtabs8(m, n, count) {
    for (var i = 1; i <= count; i++) {
        if (i == n) {
            getObject('menutab_' + m + '_' + i).style.display = '';
            getObject('menu_' + m + '_' + i).className = 'menub8_1';
        } else {
            getObject('menutab_' + m + '_' + i).style.display = 'none';
            getObject('menu_' + m + '_' + i).className = 'menub8_2';
        }
    }
}


function getObject(objectId) {
    if (document.getElementById && document.getElementById(objectId)) {
        return document.getElementById(objectId);
    } else if (document.all && document.all(objectId)) {
        return document.all(objectId);
    } else if (document.layers && document.layers[objectId]) {
        return document.layers[objectId];
    } else {
        return false;
    }
}

function MM_findObj(n, d) { //v4.01
    var p, i, x;
    if (!d) d = document;
    if ((p = n.indexOf("?")) > 0 && parent.frames.length) {
        d = parent.frames[n.substring(p + 1)].document;
        n = n.substring(0, p);
    }
    if (!(x = d[n]) && d.all) x = d.all[n];
    for (i = 0; !x && i < d.forms.length; i++) x = d.forms[i][n];
    for (i = 0; !x && d.layers && i < d.layers.length; i++) x = MM_findObj(n, d.layers[i].document);
    if (!x && d.getElementById) x = d.getElementById(n);
    return x;
}

function MM_showHideLayers() { //v6.0
    var i, p, v, obj, args = MM_showHideLayers.arguments;
    for (i = 0; i < (args.length - 2); i += 3) if ((obj = MM_findObj(args[i])) != null) {
        v = args[i + 2];
        if (obj.style) {
            obj = obj.style;
            v = (v == 'show') ? 'visible' : (v == 'hide') ? 'hidden' : v;
        }
        obj.visibility = v;
    }
}










