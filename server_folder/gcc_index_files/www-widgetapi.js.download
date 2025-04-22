(function(){/*

 Copyright The Closure Library Authors.
 SPDX-License-Identifier: Apache-2.0
*/
'use strict';var m;function aa(a){var b=0;return function(){return b<a.length?{done:!1,value:a[b++]}:{done:!0}}}
var ba="function"==typeof Object.defineProperties?Object.defineProperty:function(a,b,c){if(a==Array.prototype||a==Object.prototype)return a;a[b]=c.value;return a};
function ca(a){a=["object"==typeof globalThis&&globalThis,a,"object"==typeof window&&window,"object"==typeof self&&self,"object"==typeof global&&global];for(var b=0;b<a.length;++b){var c=a[b];if(c&&c.Math==Math)return c}throw Error("Cannot find global object");}
var da=ca(this);function r(a,b){if(b)a:{var c=da;a=a.split(".");for(var d=0;d<a.length-1;d++){var e=a[d];if(!(e in c))break a;c=c[e]}a=a[a.length-1];d=c[a];b=b(d);b!=d&&null!=b&&ba(c,a,{configurable:!0,writable:!0,value:b})}}
r("Symbol",function(a){function b(f){if(this instanceof b)throw new TypeError("Symbol is not a constructor");return new c(d+(f||"")+"_"+e++,f)}
function c(f,g){this.h=f;ba(this,"description",{configurable:!0,writable:!0,value:g})}
if(a)return a;c.prototype.toString=function(){return this.h};
var d="jscomp_symbol_"+(1E9*Math.random()>>>0)+"_",e=0;return b});
r("Symbol.iterator",function(a){if(a)return a;a=Symbol("Symbol.iterator");for(var b="Array Int8Array Uint8Array Uint8ClampedArray Int16Array Uint16Array Int32Array Uint32Array Float32Array Float64Array".split(" "),c=0;c<b.length;c++){var d=da[b[c]];"function"===typeof d&&"function"!=typeof d.prototype[a]&&ba(d.prototype,a,{configurable:!0,writable:!0,value:function(){return ea(aa(this))}})}return a});
function ea(a){a={next:a};a[Symbol.iterator]=function(){return this};
return a}
function t(a){var b="undefined"!=typeof Symbol&&Symbol.iterator&&a[Symbol.iterator];return b?b.call(a):{next:aa(a)}}
function fa(a){if(!(a instanceof Array)){a=t(a);for(var b,c=[];!(b=a.next()).done;)c.push(b.value);a=c}return a}
function ha(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
var ia="function"==typeof Object.assign?Object.assign:function(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(d)for(var e in d)ha(d,e)&&(a[e]=d[e])}return a};
r("Object.assign",function(a){return a||ia});
var ja="function"==typeof Object.create?Object.create:function(a){function b(){}
b.prototype=a;return new b},la;
if("function"==typeof Object.setPrototypeOf)la=Object.setPrototypeOf;else{var ma;a:{var na={a:!0},oa={};try{oa.__proto__=na;ma=oa.a;break a}catch(a){}ma=!1}la=ma?function(a,b){a.__proto__=b;if(a.__proto__!==b)throw new TypeError(a+" is not extensible");return a}:null}var qa=la;
function u(a,b){a.prototype=ja(b.prototype);a.prototype.constructor=a;if(qa)qa(a,b);else for(var c in b)if("prototype"!=c)if(Object.defineProperties){var d=Object.getOwnPropertyDescriptor(b,c);d&&Object.defineProperty(a,c,d)}else a[c]=b[c];a.N=b.prototype}
function ra(){this.u=!1;this.l=null;this.i=void 0;this.h=1;this.m=this.v=0;this.I=this.j=null}
function sa(a){if(a.u)throw new TypeError("Generator is already running");a.u=!0}
ra.prototype.A=function(a){this.i=a};
function ta(a,b){a.j={La:b,Qa:!0};a.h=a.v||a.m}
ra.prototype.return=function(a){this.j={return:a};this.h=this.m};
function w(a,b,c){a.h=c;return{value:b}}
ra.prototype.o=function(a){this.h=a};
function ua(a,b,c){a.v=b;void 0!=c&&(a.m=c)}
function va(a,b){a.h=b;a.v=0}
function wa(a){a.v=0;var b=a.j.La;a.j=null;return b}
function xa(a){a.I=[a.j];a.v=0;a.m=0}
function ya(a){var b=a.I.splice(0)[0];(b=a.j=a.j||b)?b.Qa?a.h=a.v||a.m:void 0!=b.o&&a.m<b.o?(a.h=b.o,a.j=null):a.h=a.m:a.h=0}
function za(a){this.h=new ra;this.i=a}
function Aa(a,b){sa(a.h);var c=a.h.l;if(c)return Ba(a,"return"in c?c["return"]:function(d){return{value:d,done:!0}},b,a.h.return);
a.h.return(b);return Ca(a)}
function Ba(a,b,c,d){try{var e=b.call(a.h.l,c);if(!(e instanceof Object))throw new TypeError("Iterator result "+e+" is not an object");if(!e.done)return a.h.u=!1,e;var f=e.value}catch(g){return a.h.l=null,ta(a.h,g),Ca(a)}a.h.l=null;d.call(a.h,f);return Ca(a)}
function Ca(a){for(;a.h.h;)try{var b=a.i(a.h);if(b)return a.h.u=!1,{value:b.value,done:!1}}catch(c){a.h.i=void 0,ta(a.h,c)}a.h.u=!1;if(a.h.j){b=a.h.j;a.h.j=null;if(b.Qa)throw b.La;return{value:b.return,done:!0}}return{value:void 0,done:!0}}
function Da(a){this.next=function(b){sa(a.h);a.h.l?b=Ba(a,a.h.l.next,b,a.h.A):(a.h.A(b),b=Ca(a));return b};
this.throw=function(b){sa(a.h);a.h.l?b=Ba(a,a.h.l["throw"],b,a.h.A):(ta(a.h,b),b=Ca(a));return b};
this.return=function(b){return Aa(a,b)};
this[Symbol.iterator]=function(){return this}}
function Ea(a){function b(d){return a.next(d)}
function c(d){return a.throw(d)}
return new Promise(function(d,e){function f(g){g.done?d(g.value):Promise.resolve(g.value).then(b,c).then(f,e)}
f(a.next())})}
function x(a){return Ea(new Da(new za(a)))}
function Ha(){for(var a=Number(this),b=[],c=a;c<arguments.length;c++)b[c-a]=arguments[c];return b}
r("Reflect.setPrototypeOf",function(a){return a?a:qa?function(b,c){try{return qa(b,c),!0}catch(d){return!1}}:null});
r("Promise",function(a){function b(g){this.h=0;this.j=void 0;this.i=[];this.u=!1;var h=this.l();try{g(h.resolve,h.reject)}catch(k){h.reject(k)}}
function c(){this.h=null}
function d(g){return g instanceof b?g:new b(function(h){h(g)})}
if(a)return a;c.prototype.i=function(g){if(null==this.h){this.h=[];var h=this;this.j(function(){h.m()})}this.h.push(g)};
var e=da.setTimeout;c.prototype.j=function(g){e(g,0)};
c.prototype.m=function(){for(;this.h&&this.h.length;){var g=this.h;this.h=[];for(var h=0;h<g.length;++h){var k=g[h];g[h]=null;try{k()}catch(l){this.l(l)}}}this.h=null};
c.prototype.l=function(g){this.j(function(){throw g;})};
b.prototype.l=function(){function g(l){return function(n){k||(k=!0,l.call(h,n))}}
var h=this,k=!1;return{resolve:g(this.wa),reject:g(this.m)}};
b.prototype.wa=function(g){if(g===this)this.m(new TypeError("A Promise cannot resolve to itself"));else if(g instanceof b)this.bb(g);else{a:switch(typeof g){case "object":var h=null!=g;break a;case "function":h=!0;break a;default:h=!1}h?this.la(g):this.v(g)}};
b.prototype.la=function(g){var h=void 0;try{h=g.then}catch(k){this.m(k);return}"function"==typeof h?this.cb(h,g):this.v(g)};
b.prototype.m=function(g){this.A(2,g)};
b.prototype.v=function(g){this.A(1,g)};
b.prototype.A=function(g,h){if(0!=this.h)throw Error("Cannot settle("+g+", "+h+"): Promise already settled in state"+this.h);this.h=g;this.j=h;2===this.h&&this.ab();this.I()};
b.prototype.ab=function(){var g=this;e(function(){if(g.O()){var h=da.console;"undefined"!==typeof h&&h.error(g.j)}},1)};
b.prototype.O=function(){if(this.u)return!1;var g=da.CustomEvent,h=da.Event,k=da.dispatchEvent;if("undefined"===typeof k)return!0;"function"===typeof g?g=new g("unhandledrejection",{cancelable:!0}):"function"===typeof h?g=new h("unhandledrejection",{cancelable:!0}):(g=da.document.createEvent("CustomEvent"),g.initCustomEvent("unhandledrejection",!1,!0,g));g.promise=this;g.reason=this.j;return k(g)};
b.prototype.I=function(){if(null!=this.i){for(var g=0;g<this.i.length;++g)f.i(this.i[g]);this.i=null}};
var f=new c;b.prototype.bb=function(g){var h=this.l();g.na(h.resolve,h.reject)};
b.prototype.cb=function(g,h){var k=this.l();try{g.call(h,k.resolve,k.reject)}catch(l){k.reject(l)}};
b.prototype.then=function(g,h){function k(v,p){return"function"==typeof v?function(z){try{l(v(z))}catch(y){n(y)}}:p}
var l,n,q=new b(function(v,p){l=v;n=p});
this.na(k(g,l),k(h,n));return q};
b.prototype.catch=function(g){return this.then(void 0,g)};
b.prototype.na=function(g,h){function k(){switch(l.h){case 1:g(l.j);break;case 2:h(l.j);break;default:throw Error("Unexpected state: "+l.h);}}
var l=this;null==this.i?f.i(k):this.i.push(k);this.u=!0};
b.resolve=d;b.reject=function(g){return new b(function(h,k){k(g)})};
b.race=function(g){return new b(function(h,k){for(var l=t(g),n=l.next();!n.done;n=l.next())d(n.value).na(h,k)})};
b.all=function(g){var h=t(g),k=h.next();return k.done?d([]):new b(function(l,n){function q(z){return function(y){v[z]=y;p--;0==p&&l(v)}}
var v=[],p=0;do v.push(void 0),p++,d(k.value).na(q(v.length-1),n),k=h.next();while(!k.done)})};
return b});
r("WeakMap",function(a){function b(k){this.h=(h+=Math.random()+1).toString();if(k){k=t(k);for(var l;!(l=k.next()).done;)l=l.value,this.set(l[0],l[1])}}
function c(){}
function d(k){var l=typeof k;return"object"===l&&null!==k||"function"===l}
function e(k){if(!ha(k,g)){var l=new c;ba(k,g,{value:l})}}
function f(k){var l=Object[k];l&&(Object[k]=function(n){if(n instanceof c)return n;Object.isExtensible(n)&&e(n);return l(n)})}
if(function(){if(!a||!Object.seal)return!1;try{var k=Object.seal({}),l=Object.seal({}),n=new a([[k,2],[l,3]]);if(2!=n.get(k)||3!=n.get(l))return!1;n.delete(k);n.set(l,4);return!n.has(k)&&4==n.get(l)}catch(q){return!1}}())return a;
var g="$jscomp_hidden_"+Math.random();f("freeze");f("preventExtensions");f("seal");var h=0;b.prototype.set=function(k,l){if(!d(k))throw Error("Invalid WeakMap key");e(k);if(!ha(k,g))throw Error("WeakMap key fail: "+k);k[g][this.h]=l;return this};
b.prototype.get=function(k){return d(k)&&ha(k,g)?k[g][this.h]:void 0};
b.prototype.has=function(k){return d(k)&&ha(k,g)&&ha(k[g],this.h)};
b.prototype.delete=function(k){return d(k)&&ha(k,g)&&ha(k[g],this.h)?delete k[g][this.h]:!1};
return b});
r("Map",function(a){function b(){var h={};return h.previous=h.next=h.head=h}
function c(h,k){var l=h.h;return ea(function(){if(l){for(;l.head!=h.h;)l=l.previous;for(;l.next!=l.head;)return l=l.next,{done:!1,value:k(l)};l=null}return{done:!0,value:void 0}})}
function d(h,k){var l=k&&typeof k;"object"==l||"function"==l?f.has(k)?l=f.get(k):(l=""+ ++g,f.set(k,l)):l="p_"+k;var n=h.data_[l];if(n&&ha(h.data_,l))for(h=0;h<n.length;h++){var q=n[h];if(k!==k&&q.key!==q.key||k===q.key)return{id:l,list:n,index:h,entry:q}}return{id:l,list:n,index:-1,entry:void 0}}
function e(h){this.data_={};this.h=b();this.size=0;if(h){h=t(h);for(var k;!(k=h.next()).done;)k=k.value,this.set(k[0],k[1])}}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var h=Object.seal({x:4}),k=new a(t([[h,"s"]]));if("s"!=k.get(h)||1!=k.size||k.get({x:4})||k.set({x:4},"t")!=k||2!=k.size)return!1;var l=k.entries(),n=l.next();if(n.done||n.value[0]!=h||"s"!=n.value[1])return!1;n=l.next();return n.done||4!=n.value[0].x||"t"!=n.value[1]||!l.next().done?!1:!0}catch(q){return!1}}())return a;
var f=new WeakMap;e.prototype.set=function(h,k){h=0===h?0:h;var l=d(this,h);l.list||(l.list=this.data_[l.id]=[]);l.entry?l.entry.value=k:(l.entry={next:this.h,previous:this.h.previous,head:this.h,key:h,value:k},l.list.push(l.entry),this.h.previous.next=l.entry,this.h.previous=l.entry,this.size++);return this};
e.prototype.delete=function(h){h=d(this,h);return h.entry&&h.list?(h.list.splice(h.index,1),h.list.length||delete this.data_[h.id],h.entry.previous.next=h.entry.next,h.entry.next.previous=h.entry.previous,h.entry.head=null,this.size--,!0):!1};
e.prototype.clear=function(){this.data_={};this.h=this.h.previous=b();this.size=0};
e.prototype.has=function(h){return!!d(this,h).entry};
e.prototype.get=function(h){return(h=d(this,h).entry)&&h.value};
e.prototype.entries=function(){return c(this,function(h){return[h.key,h.value]})};
e.prototype.keys=function(){return c(this,function(h){return h.key})};
e.prototype.values=function(){return c(this,function(h){return h.value})};
e.prototype.forEach=function(h,k){for(var l=this.entries(),n;!(n=l.next()).done;)n=n.value,h.call(k,n[1],n[0],this)};
e.prototype[Symbol.iterator]=e.prototype.entries;var g=0;return e});
function Ia(a,b,c){if(null==a)throw new TypeError("The 'this' value for String.prototype."+c+" must not be null or undefined");if(b instanceof RegExp)throw new TypeError("First argument to String.prototype."+c+" must not be a regular expression");return a+""}
r("String.prototype.endsWith",function(a){return a?a:function(b,c){var d=Ia(this,b,"endsWith");b+="";void 0===c&&(c=d.length);c=Math.max(0,Math.min(c|0,d.length));for(var e=b.length;0<e&&0<c;)if(d[--c]!=b[--e])return!1;return 0>=e}});
r("Array.prototype.find",function(a){return a?a:function(b,c){a:{var d=this;d instanceof String&&(d=String(d));for(var e=d.length,f=0;f<e;f++){var g=d[f];if(b.call(c,g,f,d)){b=g;break a}}b=void 0}return b}});
r("String.prototype.startsWith",function(a){return a?a:function(b,c){var d=Ia(this,b,"startsWith");b+="";var e=d.length,f=b.length;c=Math.max(0,Math.min(c|0,d.length));for(var g=0;g<f&&c<e;)if(d[c++]!=b[g++])return!1;return g>=f}});
r("Number.isFinite",function(a){return a?a:function(b){return"number"!==typeof b?!1:!isNaN(b)&&Infinity!==b&&-Infinity!==b}});
function Ja(a,b){a instanceof String&&(a+="");var c=0,d=!1,e={next:function(){if(!d&&c<a.length){var f=c++;return{value:b(f,a[f]),done:!1}}d=!0;return{done:!0,value:void 0}}};
e[Symbol.iterator]=function(){return e};
return e}
r("Array.prototype.entries",function(a){return a?a:function(){return Ja(this,function(b,c){return[b,c]})}});
r("Object.setPrototypeOf",function(a){return a||qa});
r("Set",function(a){function b(c){this.h=new Map;if(c){c=t(c);for(var d;!(d=c.next()).done;)this.add(d.value)}this.size=this.h.size}
if(function(){if(!a||"function"!=typeof a||!a.prototype.entries||"function"!=typeof Object.seal)return!1;try{var c=Object.seal({x:4}),d=new a(t([c]));if(!d.has(c)||1!=d.size||d.add(c)!=d||1!=d.size||d.add({x:4})!=d||2!=d.size)return!1;var e=d.entries(),f=e.next();if(f.done||f.value[0]!=c||f.value[1]!=c)return!1;f=e.next();return f.done||f.value[0]==c||4!=f.value[0].x||f.value[1]!=f.value[0]?!1:e.next().done}catch(g){return!1}}())return a;
b.prototype.add=function(c){c=0===c?0:c;this.h.set(c,c);this.size=this.h.size;return this};
b.prototype.delete=function(c){c=this.h.delete(c);this.size=this.h.size;return c};
b.prototype.clear=function(){this.h.clear();this.size=0};
b.prototype.has=function(c){return this.h.has(c)};
b.prototype.entries=function(){return this.h.entries()};
b.prototype.values=function(){return this.h.values()};
b.prototype.keys=b.prototype.values;b.prototype[Symbol.iterator]=b.prototype.values;b.prototype.forEach=function(c,d){var e=this;this.h.forEach(function(f){return c.call(d,f,f,e)})};
return b});
r("Object.entries",function(a){return a?a:function(b){var c=[],d;for(d in b)ha(b,d)&&c.push([d,b[d]]);return c}});
r("Array.prototype.keys",function(a){return a?a:function(){return Ja(this,function(b){return b})}});
r("Array.prototype.values",function(a){return a?a:function(){return Ja(this,function(b,c){return c})}});
r("Number.isInteger",function(a){return a?a:function(b){return Number.isFinite(b)?b===Math.floor(b):!1}});
r("Array.from",function(a){return a?a:function(b,c,d){c=null!=c?c:function(h){return h};
var e=[],f="undefined"!=typeof Symbol&&Symbol.iterator&&b[Symbol.iterator];if("function"==typeof f){b=f.call(b);for(var g=0;!(f=b.next()).done;)e.push(c.call(d,f.value,g++))}else for(f=b.length,g=0;g<f;g++)e.push(c.call(d,b[g],g));return e}});
r("Object.is",function(a){return a?a:function(b,c){return b===c?0!==b||1/b===1/c:b!==b&&c!==c}});
r("Array.prototype.includes",function(a){return a?a:function(b,c){var d=this;d instanceof String&&(d=String(d));var e=d.length;c=c||0;for(0>c&&(c=Math.max(c+e,0));c<e;c++){var f=d[c];if(f===b||Object.is(f,b))return!0}return!1}});
r("String.prototype.includes",function(a){return a?a:function(b,c){return-1!==Ia(this,b,"includes").indexOf(b,c||0)}});
r("Number.isNaN",function(a){return a?a:function(b){return"number"===typeof b&&isNaN(b)}});
r("Number.MAX_SAFE_INTEGER",function(){return 9007199254740991});
var A=this||self;function B(a,b){a=a.split(".");b=b||A;for(var c=0;c<a.length;c++)if(b=b[a[c]],null==b)return null;return b}
function Ka(a){var b=typeof a;return"object"!=b?b:a?Array.isArray(a)?"array":b:"null"}
function La(a){var b=Ka(a);return"array"==b||"object"==b&&"number"==typeof a.length}
function Ma(a){var b=typeof a;return"object"==b&&null!=a||"function"==b}
function Na(a){return Object.prototype.hasOwnProperty.call(a,Oa)&&a[Oa]||(a[Oa]=++Pa)}
var Oa="closure_uid_"+(1E9*Math.random()>>>0),Pa=0;function Qa(a,b,c){return a.call.apply(a.bind,arguments)}
function Ra(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var e=Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(e,d);return a.apply(b,e)}}return function(){return a.apply(b,arguments)}}
function Ta(a,b,c){Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf("native code")?Ta=Qa:Ta=Ra;return Ta.apply(null,arguments)}
function C(a,b){a=a.split(".");var c=A;a[0]in c||"undefined"==typeof c.execScript||c.execScript("var "+a[0]);for(var d;a.length&&(d=a.shift());)a.length||void 0===b?c[d]&&c[d]!==Object.prototype[d]?c=c[d]:c=c[d]={}:c[d]=b}
function Ua(a,b){function c(){}
c.prototype=b.prototype;a.N=b.prototype;a.prototype=new c;a.prototype.constructor=a;a.Mb=function(d,e,f){for(var g=Array(arguments.length-2),h=2;h<arguments.length;h++)g[h-2]=arguments[h];return b.prototype[e].apply(d,g)}}
function Va(a){return a}
;function Wa(a,b){if(Error.captureStackTrace)Error.captureStackTrace(this,Wa);else{var c=Error().stack;c&&(this.stack=c)}a&&(this.message=String(a));void 0!==b&&(this.fb=b)}
Ua(Wa,Error);Wa.prototype.name="CustomError";function Xa(a){a=a.url;var b=/[?&]dsh=1(&|$)/.test(a);this.j=!b&&/[?&]ae=1(&|$)/.test(a);this.l=!b&&/[?&]ae=2(&|$)/.test(a);if((this.h=/[?&]adurl=([^&]*)/.exec(a))&&this.h[1]){try{var c=decodeURIComponent(this.h[1])}catch(d){c=null}this.i=c}}
;function Ya(){}
function Za(a){var b=!1,c;return function(){b||(c=a(),b=!0);return c}}
;var $a=Array.prototype.indexOf?function(a,b){return Array.prototype.indexOf.call(a,b,void 0)}:function(a,b){if("string"===typeof a)return"string"!==typeof b||1!=b.length?-1:a.indexOf(b,0);
for(var c=0;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},D=Array.prototype.forEach?function(a,b,c){Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e="string"===typeof a?a.split(""):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},ab=Array.prototype.reduce?function(a,b,c){return Array.prototype.reduce.call(a,b,c)}:function(a,b,c){var d=c;
D(a,function(e,f){d=b.call(void 0,d,e,f,a)});
return d};
function bb(a,b){b=$a(a,b);var c;(c=0<=b)&&Array.prototype.splice.call(a,b,1);return c}
function db(a){return Array.prototype.concat.apply([],arguments)}
function eb(a){var b=a.length;if(0<b){for(var c=Array(b),d=0;d<b;d++)c[d]=a[d];return c}return[]}
function fb(a,b){for(var c=1;c<arguments.length;c++){var d=arguments[c];if(La(d)){var e=a.length||0,f=d.length||0;a.length=e+f;for(var g=0;g<f;g++)a[e+g]=d[g]}else a.push(d)}}
;function gb(a,b){for(var c in a)b.call(void 0,a[c],c,a)}
function hb(a){var b=ib,c;for(c in b)if(a.call(void 0,b[c],c,b))return c}
function pb(a,b){for(var c in a)if(!(c in b)||a[c]!==b[c])return!1;for(var d in b)if(!(d in a))return!1;return!0}
function qb(a){if(!a||"object"!==typeof a)return a;if("function"===typeof a.clone)return a.clone();if("undefined"!==typeof Map&&a instanceof Map)return new Map(a);if("undefined"!==typeof Set&&a instanceof Set)return new Set(a);var b=Array.isArray(a)?[]:"function"!==typeof ArrayBuffer||"function"!==typeof ArrayBuffer.isView||!ArrayBuffer.isView(a)||a instanceof DataView?{}:new a.constructor(a.length),c;for(c in a)b[c]=qb(a[c]);return b}
var rb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" ");function sb(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<rb.length;f++)c=rb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}}
;var tb;function ub(){}
function vb(a){return new ub(wb,a)}
var wb={};vb("");var xb=String.prototype.trim?function(a){return a.trim()}:function(a){return/^[\s\xa0]*([\s\S]*?)[\s\xa0]*$/.exec(a)[1]},yb=/&/g,zb=/</g,Ab=/>/g,Bb=/"/g,Cb=/'/g,Db=/\x00/g,Eb=/[\x00&<>"']/;function Fb(){var a=A.navigator;return a&&(a=a.userAgent)?a:""}
function E(a){return-1!=Fb().indexOf(a)}
;function Gb(){return(E("Chrome")||E("CriOS"))&&!E("Edge")||E("Silk")}
;var Hb={};function Ib(a){this.h=Hb===Hb?a:""}
Ib.prototype.toString=function(){return this.h.toString()};var Jb=RegExp("^(?:([^:/?#.]+):)?(?://(?:([^\\\\/?#]*)@)?([^\\\\/?#]*?)(?::([0-9]+))?(?=[\\\\/?#]|$))?([^?#]+)?(?:\\?([^#]*))?(?:#([\\s\\S]*))?$");function Kb(a){return a?decodeURI(a):a}
function Lb(a){return Kb(a.match(Jb)[3]||null)}
function Mb(a){var b=a.match(Jb);a=b[1];var c=b[2],d=b[3];b=b[4];var e="";a&&(e+=a+":");d&&(e+="//",c&&(e+=c+"@"),e+=d,b&&(e+=":"+b));return e}
function Rb(a,b,c){if(Array.isArray(b))for(var d=0;d<b.length;d++)Rb(a,String(b[d]),c);else null!=b&&c.push(a+(""===b?"":"="+encodeURIComponent(String(b))))}
function Sb(a){var b=[],c;for(c in a)Rb(c,a[c],b);return b.join("&")}
var Tb=/#|$/;function Ub(a,b){var c=a.search(Tb);a:{var d=0;for(var e=b.length;0<=(d=a.indexOf(b,d))&&d<c;){var f=a.charCodeAt(d-1);if(38==f||63==f)if(f=a.charCodeAt(d+e),!f||61==f||38==f||35==f)break a;d+=e+1}d=-1}if(0>d)return null;e=a.indexOf("&",d);if(0>e||e>c)e=c;d+=b.length+1;return decodeURIComponent(a.slice(d,-1!==e?e:0).replace(/\+/g," "))}
;function Vb(){return E("iPhone")&&!E("iPod")&&!E("iPad")}
;function Wb(a){Wb[" "](a);return a}
Wb[" "]=function(){};var Xb=E("Opera"),Yb=E("Trident")||E("MSIE"),Zb=E("Edge"),$b=E("Gecko")&&!(-1!=Fb().toLowerCase().indexOf("webkit")&&!E("Edge"))&&!(E("Trident")||E("MSIE"))&&!E("Edge"),ac=-1!=Fb().toLowerCase().indexOf("webkit")&&!E("Edge");function bc(){var a=A.document;return a?a.documentMode:void 0}
var cc;a:{var dc="",ec=function(){var a=Fb();if($b)return/rv:([^\);]+)(\)|;)/.exec(a);if(Zb)return/Edge\/([\d\.]+)/.exec(a);if(Yb)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);if(ac)return/WebKit\/(\S+)/.exec(a);if(Xb)return/(?:Version)[ \/]?(\S+)/.exec(a)}();
ec&&(dc=ec?ec[1]:"");if(Yb){var fc=bc();if(null!=fc&&fc>parseFloat(dc)){cc=String(fc);break a}}cc=dc}var gc=cc,ic;if(A.document&&Yb){var jc=bc();ic=jc?jc:parseInt(gc,10)||void 0}else ic=void 0;var kc=ic;var lc=Vb()||E("iPod"),mc=E("iPad");!E("Android")||Gb();Gb();var nc=E("Safari")&&!(Gb()||E("Coast")||E("Opera")||E("Edge")||E("Edg/")||E("OPR")||E("Firefox")||E("FxiOS")||E("Silk")||E("Android"))&&!(Vb()||E("iPad")||E("iPod"));var oc={},pc=null;
function tc(a,b){La(a);void 0===b&&(b=0);if(!pc){pc={};for(var c="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".split(""),d=["+/=","+/","-_=","-_.","-_"],e=0;5>e;e++){var f=c.concat(d[e].split(""));oc[e]=f;for(var g=0;g<f.length;g++){var h=f[g];void 0===pc[h]&&(pc[h]=g)}}}b=oc[b];c=Array(Math.floor(a.length/3));d=b[64]||"";for(e=f=0;f<a.length-2;f+=3){var k=a[f],l=a[f+1];h=a[f+2];g=b[k>>2];k=b[(k&3)<<4|l>>4];l=b[(l&15)<<2|h>>6];h=b[h&63];c[e++]=""+g+k+l+h}g=0;h=d;switch(a.length-
f){case 2:g=a[f+1],h=b[(g&15)<<2]||d;case 1:a=a[f],c[e]=""+b[a>>2]+b[(a&3)<<4|g>>4]+h+d}return c.join("")}
;var uc="undefined"!==typeof Uint8Array;var vc="function"===typeof Symbol&&"symbol"===typeof Symbol()?Symbol(void 0):void 0;function wc(a,b){Object.isFrozen(a)||(vc?a[vc]|=b:void 0!==a.ra?a.ra|=b:Object.defineProperties(a,{ra:{value:b,configurable:!0,writable:!0,enumerable:!1}}))}
function xc(a){var b;vc?b=a[vc]:b=a.ra;return null==b?0:b}
function yc(a){wc(a,1);return a}
function zc(a){return Array.isArray(a)?!!(xc(a)&2):!1}
function Ac(a){if(!Array.isArray(a))throw Error("cannot mark non-array as immutable");wc(a,2)}
;function Bc(a){return null!==a&&"object"===typeof a&&!Array.isArray(a)&&a.constructor===Object}
var Cc,Dc=Object.freeze(yc([]));function Ec(a){if(zc(a.C))throw Error("Cannot mutate an immutable Message");}
var Fc="undefined"!=typeof Symbol&&"undefined"!=typeof Symbol.hasInstance;function Gc(a){return{value:a,configurable:!1,writable:!1,enumerable:!1}}
;function Hc(a){switch(typeof a){case "number":return isFinite(a)?a:String(a);case "object":if(a&&!Array.isArray(a)&&uc&&null!=a&&a instanceof Uint8Array)return tc(a)}return a}
;function Ic(a,b){b=void 0===b?Jc:b;return Kc(a,b)}
function Lc(a,b){if(null!=a){if(Array.isArray(a))a=Kc(a,b);else if(Bc(a)){var c={},d;for(d in a)c[d]=Lc(a[d],b);a=c}else a=b(a);return a}}
function Kc(a,b){for(var c=a.slice(),d=0;d<c.length;d++)c[d]=Lc(c[d],b);Array.isArray(a)&&xc(a)&1&&yc(c);return c}
function Mc(a){if(a&&"object"==typeof a&&a.toJSON)return a.toJSON();a=Hc(a);return Array.isArray(a)?Ic(a,Mc):a}
function Jc(a){return uc&&null!=a&&a instanceof Uint8Array?new Uint8Array(a):a}
;function Nc(a,b,c){return-1===b?null:b>=a.l?a.i?a.i[b]:void 0:(void 0===c?0:c)&&a.i&&(c=a.i[b],null!=c)?c:a.C[b+a.j]}
function G(a,b,c,d,e){d=void 0===d?!1:d;(void 0===e?0:e)||Ec(a);b<a.l&&!d?a.C[b+a.j]=c:(a.i||(a.i=a.C[a.l+a.j]={}))[b]=c;return a}
function Oc(a,b,c,d){c=void 0===c?!0:c;d=void 0===d?!1:d;var e=Nc(a,b,d);null==e&&(e=Dc);if(zc(a.C))c&&(Ac(e),Object.freeze(e));else if(e===Dc||zc(e))e=yc(e.slice()),G(a,b,e,d);return e}
function Pc(a,b,c,d){Ec(a);(c=Qc(a,c))&&c!==b&&null!=d&&(a.h&&c in a.h&&(a.h[c]=void 0),G(a,c));return G(a,b,d)}
function Qc(a,b){for(var c=0,d=0;d<b.length;d++){var e=b[d];null!=Nc(a,e)&&(0!==c&&G(a,c,void 0,!1,!0),c=e)}return c}
function Rc(a,b,c,d,e){if(-1===c)return null;a.h||(a.h={});var f=a.h[c];if(f)return f;e=Nc(a,c,void 0===e?!1:e);if(null==e&&!d)return f;b=new b(e);zc(a.C)&&Ac(b.C);return a.h[c]=b}
function Sc(a,b,c,d){d=void 0===d?!1:d;a.h||(a.h={});var e=zc(a.C),f=a.h[c];if(!f){d=Oc(a,c,!0,d);f=[];e=e||zc(d);for(var g=0;g<d.length;g++)f[g]=new b(d[g]),e&&Ac(f[g].C);e&&(Ac(f),Object.freeze(f));a.h[c]=f}return f}
function H(a,b,c,d){d=void 0===d?!1:d;Ec(a);a.h||(a.h={});var e=c?c.C:c;a.h[b]=c;return G(a,b,e,d)}
function Tc(a,b,c,d){Ec(a);a.h||(a.h={});var e=d?d.C:d;a.h[b]=d;Pc(a,b,c,e)}
function Uc(a,b,c,d){var e=void 0===e?!1:e;Ec(a);e=Sc(a,c,b,e);c=d?d:new c;a=Oc(a,b);e.push(c);a.push(c.C)}
function Vc(a,b){a=Nc(a,b);return null==a?"":a}
;function Wc(a,b,c){a||(a=Xc);Xc=null;var d=this.constructor.i;a||(a=d?[d]:[]);this.j=(d?0:-1)-(this.constructor.h||0);this.h=void 0;this.C=a;a:{d=this.C.length;a=d-1;if(d&&(d=this.C[a],Bc(d))){this.l=a-this.j;this.i=d;break a}void 0!==b&&-1<b?(this.l=Math.max(b,a+1-this.j),this.i=void 0):this.l=Number.MAX_VALUE}if(c)for(b=0;b<c.length;b++)if(a=c[b],a<this.l)a+=this.j,(d=this.C[a])?Array.isArray(d)&&yc(d):this.C[a]=Dc;else{d=this.i||(this.i=this.C[this.l+this.j]={});var e=d[a];e?Array.isArray(e)&&
yc(e):d[a]=Dc}}
Wc.prototype.toJSON=function(){var a=this.C;return Cc?a:Ic(a,Mc)};
function Yc(a){Cc=!0;try{return JSON.stringify(a.toJSON(),Zc)}finally{Cc=!1}}
Wc.prototype.clone=function(){var a=Ic(this.C);Xc=a;a=new this.constructor(a);Xc=null;$c(a,this);return a};
Wc.prototype.toString=function(){return this.C.toString()};
function Zc(a,b){return Hc(b)}
function $c(a,b){b.m&&(a.m=b.m.slice());var c=b.h;if(c){b=b.i;for(var d in c){var e=c[d];if(e){var f=!(!b||!b[d]),g=+d;if(Array.isArray(e)){if(e.length)for(f=Sc(a,e[0].constructor,g,f),g=0;g<Math.min(f.length,e.length);g++)$c(f[g],e[g])}else(f=Rc(a,e.constructor,g,void 0,f))&&$c(f,e)}}}}
var Xc;function ad(){Wc.apply(this,arguments)}
u(ad,Wc);if(Fc){var bd={};Object.defineProperties(ad,(bd[Symbol.hasInstance]=Gc(function(){throw Error("Cannot perform instanceof checks for MutableMessage");}),bd))};function cd(a,b){var c=this.h;if(this.isRepeated){var d=!0;d=void 0===d?!1:d;Ec(a);if(b){var e=yc([]);for(var f=0;f<b.length;f++)e[f]=b[f].C;a.h||(a.h={});a.h[c]=b}else a.h&&(a.h[c]=void 0),e=Dc;a=G(a,c,e,d)}else a=H(a,c,b,!0);return a}
;function I(){ad.apply(this,arguments)}
u(I,ad);if(Fc){var dd={};Object.defineProperties(I,(dd[Symbol.hasInstance]=Gc(Object[Symbol.hasInstance]),dd))};var ed=window;vb("csi.gstatic.com");vb("googleads.g.doubleclick.net");vb("partner.googleadservices.com");vb("pubads.g.doubleclick.net");vb("securepubads.g.doubleclick.net");vb("tpc.googlesyndication.com");/*

 SPDX-License-Identifier: Apache-2.0
*/
function fd(a,b){this.width=a;this.height=b}
m=fd.prototype;m.clone=function(){return new fd(this.width,this.height)};
m.aspectRatio=function(){return this.width/this.height};
m.isEmpty=function(){return!(this.width*this.height)};
m.ceil=function(){this.width=Math.ceil(this.width);this.height=Math.ceil(this.height);return this};
m.floor=function(){this.width=Math.floor(this.width);this.height=Math.floor(this.height);return this};
m.round=function(){this.width=Math.round(this.width);this.height=Math.round(this.height);return this};
m.scale=function(a,b){this.width*=a;this.height*="number"===typeof b?b:a;return this};function gd(){var a=document;var b="IFRAME";"application/xhtml+xml"===a.contentType&&(b=b.toLowerCase());return a.createElement(b)}
function hd(a,b){for(var c=0;a;){if(b(a))return a;a=a.parentNode;c++}return null}
;function id(a){var b=jd;if(b)for(var c in b)Object.prototype.hasOwnProperty.call(b,c)&&a(b[c],c,b)}
function kd(){var a=[];id(function(b){a.push(b)});
return a}
var jd={ub:"allow-forms",vb:"allow-modals",wb:"allow-orientation-lock",xb:"allow-pointer-lock",yb:"allow-popups",zb:"allow-popups-to-escape-sandbox",Ab:"allow-presentation",Bb:"allow-same-origin",Cb:"allow-scripts",Db:"allow-top-navigation",Eb:"allow-top-navigation-by-user-activation"},ld=Za(function(){return kd()});
function md(){var a=nd(),b={};D(ld(),function(c){a.sandbox&&a.sandbox.supports&&a.sandbox.supports(c)&&(b[c]=!0)});
return b}
function nd(){var a=void 0===a?document:a;return a.createElement("iframe")}
;var od=(new Date).getTime();function pd(a){if(!a)return"";if(/^about:(?:blank|srcdoc)$/.test(a))return window.origin||"";a=a.split("#")[0].split("?")[0];a=a.toLowerCase();0==a.indexOf("//")&&(a=window.location.protocol+a);/^[\w\-]*:\/\//.test(a)||(a=window.location.href);var b=a.substring(a.indexOf("://")+3),c=b.indexOf("/");-1!=c&&(b=b.substring(0,c));c=a.substring(0,a.indexOf("://"));if(!c)throw Error("URI is missing protocol: "+a);if("http"!==c&&"https"!==c&&"chrome-extension"!==c&&"moz-extension"!==c&&"file"!==c&&"android-app"!==
c&&"chrome-search"!==c&&"chrome-untrusted"!==c&&"chrome"!==c&&"app"!==c&&"devtools"!==c)throw Error("Invalid URI scheme in origin: "+c);a="";var d=b.indexOf(":");if(-1!=d){var e=b.substring(d+1);b=b.substring(0,d);if("http"===c&&"80"!==e||"https"===c&&"443"!==e)a=":"+e}return c+"://"+b+a}
;var qd="client_dev_mss_url client_dev_regex_map client_dev_root_url client_rollout_override expflag jsfeat jsmode mods".split(" ");fa(qd);function ud(){function a(){e[0]=1732584193;e[1]=4023233417;e[2]=2562383102;e[3]=271733878;e[4]=3285377520;n=l=0}
function b(q){for(var v=g,p=0;64>p;p+=4)v[p/4]=q[p]<<24|q[p+1]<<16|q[p+2]<<8|q[p+3];for(p=16;80>p;p++)q=v[p-3]^v[p-8]^v[p-14]^v[p-16],v[p]=(q<<1|q>>>31)&4294967295;q=e[0];var z=e[1],y=e[2],F=e[3],M=e[4];for(p=0;80>p;p++){if(40>p)if(20>p){var K=F^z&(y^F);var N=1518500249}else K=z^y^F,N=1859775393;else 60>p?(K=z&y|F&(z|y),N=2400959708):(K=z^y^F,N=3395469782);K=((q<<5|q>>>27)&4294967295)+K+M+N+v[p]&4294967295;M=F;F=y;y=(z<<30|z>>>2)&4294967295;z=q;q=K}e[0]=e[0]+q&4294967295;e[1]=e[1]+z&4294967295;e[2]=
e[2]+y&4294967295;e[3]=e[3]+F&4294967295;e[4]=e[4]+M&4294967295}
function c(q,v){if("string"===typeof q){q=unescape(encodeURIComponent(q));for(var p=[],z=0,y=q.length;z<y;++z)p.push(q.charCodeAt(z));q=p}v||(v=q.length);p=0;if(0==l)for(;p+64<v;)b(q.slice(p,p+64)),p+=64,n+=64;for(;p<v;)if(f[l++]=q[p++],n++,64==l)for(l=0,b(f);p+64<v;)b(q.slice(p,p+64)),p+=64,n+=64}
function d(){var q=[],v=8*n;56>l?c(h,56-l):c(h,64-(l-56));for(var p=63;56<=p;p--)f[p]=v&255,v>>>=8;b(f);for(p=v=0;5>p;p++)for(var z=24;0<=z;z-=8)q[v++]=e[p]>>z&255;return q}
for(var e=[],f=[],g=[],h=[128],k=1;64>k;++k)h[k]=0;var l,n;a();return{reset:a,update:c,digest:d,hb:function(){for(var q=d(),v="",p=0;p<q.length;p++)v+="0123456789ABCDEF".charAt(Math.floor(q[p]/16))+"0123456789ABCDEF".charAt(q[p]%16);return v}}}
;function vd(a,b,c){var d=String(A.location.href);return d&&a&&b?[b,wd(pd(d),a,c||null)].join(" "):null}
function wd(a,b,c){var d=[],e=[];if(1==(Array.isArray(c)?2:1))return e=[b,a],D(d,function(h){e.push(h)}),xd(e.join(" "));
var f=[],g=[];D(c,function(h){g.push(h.key);f.push(h.value)});
c=Math.floor((new Date).getTime()/1E3);e=0==f.length?[c,b,a]:[f.join(":"),c,b,a];D(d,function(h){e.push(h)});
a=xd(e.join(" "));a=[c,a];0==g.length||a.push(g.join(""));return a.join("_")}
function xd(a){var b=ud();b.update(a);return b.hb().toLowerCase()}
;var yd={};function zd(a){this.h=a||{cookie:""}}
m=zd.prototype;m.isEnabled=function(){if(!A.navigator.cookieEnabled)return!1;if(!this.isEmpty())return!0;this.set("TESTCOOKIESENABLED","1",{Aa:60});if("1"!==this.get("TESTCOOKIESENABLED"))return!1;this.remove("TESTCOOKIESENABLED");return!0};
m.set=function(a,b,c){var d=!1;if("object"===typeof c){var e=c.Rb;d=c.secure||!1;var f=c.domain||void 0;var g=c.path||void 0;var h=c.Aa}if(/[;=\s]/.test(a))throw Error('Invalid cookie name "'+a+'"');if(/[;\r\n]/.test(b))throw Error('Invalid cookie value "'+b+'"');void 0===h&&(h=-1);c=f?";domain="+f:"";g=g?";path="+g:"";d=d?";secure":"";h=0>h?"":0==h?";expires="+(new Date(1970,1,1)).toUTCString():";expires="+(new Date(Date.now()+1E3*h)).toUTCString();this.h.cookie=a+"="+b+c+g+h+d+(null!=e?";samesite="+
e:"")};
m.get=function(a,b){for(var c=a+"=",d=(this.h.cookie||"").split(";"),e=0,f;e<d.length;e++){f=xb(d[e]);if(0==f.lastIndexOf(c,0))return f.slice(c.length);if(f==a)return""}return b};
m.remove=function(a,b,c){var d=void 0!==this.get(a);this.set(a,"",{Aa:0,path:b,domain:c});return d};
m.isEmpty=function(){return!this.h.cookie};
m.clear=function(){for(var a=(this.h.cookie||"").split(";"),b=[],c=[],d,e,f=0;f<a.length;f++)e=xb(a[f]),d=e.indexOf("="),-1==d?(b.push(""),c.push(e)):(b.push(e.substring(0,d)),c.push(e.substring(d+1)));for(a=b.length-1;0<=a;a--)this.remove(b[a])};
var Ad=new zd("undefined"==typeof document?null:document);function Bd(a){return!!yd.FPA_SAMESITE_PHASE2_MOD||!(void 0===a||!a)}
function Cd(a,b,c,d){(a=A[a])||(a=(new zd(document)).get(b));return a?vd(a,c,d):null}
function Dd(a){var b=void 0===b?!1:b;var c=pd(String(A.location.href)),d=[];var e=b;e=void 0===e?!1:e;var f=A.__SAPISID||A.__APISID||A.__3PSAPISID||A.__OVERRIDE_SID;Bd(e)&&(f=f||A.__1PSAPISID);if(f)e=!0;else{var g=new zd(document);f=g.get("SAPISID")||g.get("APISID")||g.get("__Secure-3PAPISID")||g.get("SID");Bd(e)&&(f=f||g.get("__Secure-1PAPISID"));e=!!f}e&&(e=(c=0==c.indexOf("https:")||0==c.indexOf("chrome-extension:")||0==c.indexOf("moz-extension:"))?A.__SAPISID:A.__APISID,e||(e=new zd(document),
e=e.get(c?"SAPISID":"APISID")||e.get("__Secure-3PAPISID")),(e=e?vd(e,c?"SAPISIDHASH":"APISIDHASH",a):null)&&d.push(e),c&&Bd(b)&&((b=Cd("__1PSAPISID","__Secure-1PAPISID","SAPISID1PHASH",a))&&d.push(b),(a=Cd("__3PSAPISID","__Secure-3PAPISID","SAPISID3PHASH",a))&&d.push(a)));return 0==d.length?null:d.join(" ")}
;function Ed(a){if(Fc){var b={};Object.defineProperties(a,(b[Symbol.hasInstance]=Gc(Object[Symbol.hasInstance]),b))}}
;function Fd(){this.l=this.l;this.v=this.v}
Fd.prototype.l=!1;Fd.prototype.dispose=function(){this.l||(this.l=!0,this.fa())};
Fd.prototype.fa=function(){if(this.v)for(;this.v.length;)this.v.shift()()};function Gd(a,b){this.type=a;this.h=this.target=b;this.defaultPrevented=this.j=!1}
Gd.prototype.stopPropagation=function(){this.j=!0};
Gd.prototype.preventDefault=function(){this.defaultPrevented=!0};function Hd(a){var b=B("window.location.href");null==a&&(a='Unknown Error of type "null/undefined"');if("string"===typeof a)return{message:a,name:"Unknown error",lineNumber:"Not available",fileName:b,stack:"Not available"};var c=!1;try{var d=a.lineNumber||a.line||"Not available"}catch(g){d="Not available",c=!0}try{var e=a.fileName||a.filename||a.sourceURL||A.$googDebugFname||b}catch(g){e="Not available",c=!0}b=Id(a);if(!(!c&&a.lineNumber&&a.fileName&&a.stack&&a.message&&a.name)){c=a.message;if(null==
c){if(a.constructor&&a.constructor instanceof Function){if(a.constructor.name)c=a.constructor.name;else if(c=a.constructor,Jd[c])c=Jd[c];else{c=String(c);if(!Jd[c]){var f=/function\s+([^\(]+)/m.exec(c);Jd[c]=f?f[1]:"[Anonymous]"}c=Jd[c]}c='Unknown Error of type "'+c+'"'}else c="Unknown Error of unknown type";"function"===typeof a.toString&&Object.prototype.toString!==a.toString&&(c+=": "+a.toString())}return{message:c,name:a.name||"UnknownError",lineNumber:d,fileName:e,stack:b||"Not available"}}a.stack=
b;return{message:a.message,name:a.name,lineNumber:a.lineNumber,fileName:a.fileName,stack:a.stack}}
function Id(a,b){b||(b={});b[Kd(a)]=!0;var c=a.stack||"";(a=a.fb)&&!b[Kd(a)]&&(c+="\nCaused by: ",a.stack&&0==a.stack.indexOf(a.toString())||(c+="string"===typeof a?a:a.message+"\n"),c+=Id(a,b));return c}
function Kd(a){var b="";"function"===typeof a.toString&&(b=""+a);return b+a.stack}
var Jd={};var Ld=function(){if(!A.addEventListener||!Object.defineProperty)return!1;var a=!1,b=Object.defineProperty({},"passive",{get:function(){a=!0}});
try{A.addEventListener("test",function(){},b),A.removeEventListener("test",function(){},b)}catch(c){}return a}();function Md(a,b){Gd.call(this,a?a.type:"");this.relatedTarget=this.h=this.target=null;this.button=this.screenY=this.screenX=this.clientY=this.clientX=0;this.key="";this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this.state=null;this.pointerId=0;this.pointerType="";this.i=null;a&&this.init(a,b)}
Ua(Md,Gd);var Nd={2:"touch",3:"pen",4:"mouse"};
Md.prototype.init=function(a,b){var c=this.type=a.type,d=a.changedTouches&&a.changedTouches.length?a.changedTouches[0]:null;this.target=a.target||a.srcElement;this.h=b;if(b=a.relatedTarget){if($b){a:{try{Wb(b.nodeName);var e=!0;break a}catch(f){}e=!1}e||(b=null)}}else"mouseover"==c?b=a.fromElement:"mouseout"==c&&(b=a.toElement);this.relatedTarget=b;d?(this.clientX=void 0!==d.clientX?d.clientX:d.pageX,this.clientY=void 0!==d.clientY?d.clientY:d.pageY,this.screenX=d.screenX||0,this.screenY=d.screenY||
0):(this.clientX=void 0!==a.clientX?a.clientX:a.pageX,this.clientY=void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a.screenX||0,this.screenY=a.screenY||0);this.button=a.button;this.keyCode=a.keyCode||0;this.key=a.key||"";this.charCode=a.charCode||("keypress"==c?a.keyCode:0);this.ctrlKey=a.ctrlKey;this.altKey=a.altKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.pointerId=a.pointerId||0;this.pointerType="string"===typeof a.pointerType?a.pointerType:Nd[a.pointerType]||"";this.state=a.state;
this.i=a;a.defaultPrevented&&Md.N.preventDefault.call(this)};
Md.prototype.stopPropagation=function(){Md.N.stopPropagation.call(this);this.i.stopPropagation?this.i.stopPropagation():this.i.cancelBubble=!0};
Md.prototype.preventDefault=function(){Md.N.preventDefault.call(this);var a=this.i;a.preventDefault?a.preventDefault():a.returnValue=!1};var Od="closure_listenable_"+(1E6*Math.random()|0);var Pd=0;function Qd(a,b,c,d,e){this.listener=a;this.proxy=null;this.src=b;this.type=c;this.capture=!!d;this.qa=e;this.key=++Pd;this.ha=this.ma=!1}
function Rd(a){a.ha=!0;a.listener=null;a.proxy=null;a.src=null;a.qa=null}
;function Sd(a){this.src=a;this.listeners={};this.h=0}
Sd.prototype.add=function(a,b,c,d,e){var f=a.toString();a=this.listeners[f];a||(a=this.listeners[f]=[],this.h++);var g=Td(a,b,d,e);-1<g?(b=a[g],c||(b.ma=!1)):(b=new Qd(b,this.src,f,!!d,e),b.ma=c,a.push(b));return b};
Sd.prototype.remove=function(a,b,c,d){a=a.toString();if(!(a in this.listeners))return!1;var e=this.listeners[a];b=Td(e,b,c,d);return-1<b?(Rd(e[b]),Array.prototype.splice.call(e,b,1),0==e.length&&(delete this.listeners[a],this.h--),!0):!1};
function Ud(a,b){var c=b.type;c in a.listeners&&bb(a.listeners[c],b)&&(Rd(b),0==a.listeners[c].length&&(delete a.listeners[c],a.h--))}
function Td(a,b,c,d){for(var e=0;e<a.length;++e){var f=a[e];if(!f.ha&&f.listener==b&&f.capture==!!c&&f.qa==d)return e}return-1}
;var Vd="closure_lm_"+(1E6*Math.random()|0),Wd={},Xd=0;function Yd(a,b,c,d,e){if(d&&d.once)Zd(a,b,c,d,e);else if(Array.isArray(b))for(var f=0;f<b.length;f++)Yd(a,b[f],c,d,e);else c=$d(c),a&&a[Od]?a.R(b,c,Ma(d)?!!d.capture:!!d,e):ae(a,b,c,!1,d,e)}
function ae(a,b,c,d,e,f){if(!b)throw Error("Invalid event type");var g=Ma(e)?!!e.capture:!!e,h=be(a);h||(a[Vd]=h=new Sd(a));c=h.add(b,c,d,g,f);if(!c.proxy){d=ce();c.proxy=d;d.src=a;d.listener=c;if(a.addEventListener)Ld||(e=g),void 0===e&&(e=!1),a.addEventListener(b.toString(),d,e);else if(a.attachEvent)a.attachEvent(de(b.toString()),d);else if(a.addListener&&a.removeListener)a.addListener(d);else throw Error("addEventListener and attachEvent are unavailable.");Xd++}}
function ce(){function a(c){return b.call(a.src,a.listener,c)}
var b=ee;return a}
function Zd(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)Zd(a,b[f],c,d,e);else c=$d(c),a&&a[Od]?a.j.add(String(b),c,!0,Ma(d)?!!d.capture:!!d,e):ae(a,b,c,!0,d,e)}
function fe(a,b,c,d,e){if(Array.isArray(b))for(var f=0;f<b.length;f++)fe(a,b[f],c,d,e);else(d=Ma(d)?!!d.capture:!!d,c=$d(c),a&&a[Od])?a.j.remove(String(b),c,d,e):a&&(a=be(a))&&(b=a.listeners[b.toString()],a=-1,b&&(a=Td(b,c,d,e)),(c=-1<a?b[a]:null)&&ge(c))}
function ge(a){if("number"!==typeof a&&a&&!a.ha){var b=a.src;if(b&&b[Od])Ud(b.j,a);else{var c=a.type,d=a.proxy;b.removeEventListener?b.removeEventListener(c,d,a.capture):b.detachEvent?b.detachEvent(de(c),d):b.addListener&&b.removeListener&&b.removeListener(d);Xd--;(c=be(b))?(Ud(c,a),0==c.h&&(c.src=null,b[Vd]=null)):Rd(a)}}}
function de(a){return a in Wd?Wd[a]:Wd[a]="on"+a}
function ee(a,b){if(a.ha)a=!0;else{b=new Md(b,this);var c=a.listener,d=a.qa||a.src;a.ma&&ge(a);a=c.call(d,b)}return a}
function be(a){a=a[Vd];return a instanceof Sd?a:null}
var he="__closure_events_fn_"+(1E9*Math.random()>>>0);function $d(a){if("function"===typeof a)return a;a[he]||(a[he]=function(b){return a.handleEvent(b)});
return a[he]}
;function J(){Fd.call(this);this.j=new Sd(this);this.wa=this;this.I=null}
Ua(J,Fd);J.prototype[Od]=!0;J.prototype.addEventListener=function(a,b,c,d){Yd(this,a,b,c,d)};
J.prototype.removeEventListener=function(a,b,c,d){fe(this,a,b,c,d)};
function ie(a,b){var c=a.I;if(c){var d=[];for(var e=1;c;c=c.I)d.push(c),++e}a=a.wa;c=b.type||b;"string"===typeof b?b=new Gd(b,a):b instanceof Gd?b.target=b.target||a:(e=b,b=new Gd(c,a),sb(b,e));e=!0;if(d)for(var f=d.length-1;!b.j&&0<=f;f--){var g=b.h=d[f];e=je(g,c,!0,b)&&e}b.j||(g=b.h=a,e=je(g,c,!0,b)&&e,b.j||(e=je(g,c,!1,b)&&e));if(d)for(f=0;!b.j&&f<d.length;f++)g=b.h=d[f],e=je(g,c,!1,b)&&e}
J.prototype.fa=function(){J.N.fa.call(this);if(this.j){var a=this.j,b=0,c;for(c in a.listeners){for(var d=a.listeners[c],e=0;e<d.length;e++)++b,Rd(d[e]);delete a.listeners[c];a.h--}}this.I=null};
J.prototype.R=function(a,b,c,d){return this.j.add(String(a),b,!1,c,d)};
function je(a,b,c,d){b=a.j.listeners[String(b)];if(!b)return!0;b=b.concat();for(var e=!0,f=0;f<b.length;++f){var g=b[f];if(g&&!g.ha&&g.capture==c){var h=g.listener,k=g.qa||g.src;g.ma&&Ud(a.j,g);e=!1!==h.call(k,d)&&e}}return e&&!d.defaultPrevented}
;function ke(a){J.call(this);var b=this;this.A=this.i=0;this.J=null!=a?a:{L:function(e,f){return setTimeout(e,f)},
Y:clearTimeout};var c,d;this.h=null!=(d=null==(c=window.navigator)?void 0:c.onLine)?d:!0;this.m=function(){return x(function(e){return w(e,le(b),0)})};
window.addEventListener("offline",this.m);window.addEventListener("online",this.m);this.A||me(this)}
u(ke,J);function ne(){var a=oe;ke.h||(ke.h=new ke(a));return ke.h}
ke.prototype.dispose=function(){window.removeEventListener("offline",this.m);window.removeEventListener("online",this.m);this.J.Y(this.A);delete ke.h};
ke.prototype.F=function(){return this.h};
function me(a){a.A=a.J.L(function(){var b;return x(function(c){if(1==c.h)return a.h?(null==(b=window.navigator)?0:b.onLine)?c.o(3):w(c,le(a),3):w(c,le(a),3);me(a);c.h=0})},3E4)}
function le(a,b){return a.u?a.u:a.u=new Promise(function(c){var d,e,f,g;return x(function(h){switch(h.h){case 1:return d=window.AbortController?new window.AbortController:void 0,f=null==(e=d)?void 0:e.signal,g=!1,ua(h,2,3),d&&(a.i=a.J.L(function(){d.abort()},b||2E4)),w(h,fetch("/generate_204",{method:"HEAD",
signal:f}),5);case 5:g=!0;case 3:xa(h);a.u=void 0;a.i&&(a.J.Y(a.i),a.i=0);g!==a.h&&(a.h=g,a.h?ie(a,"networkstatus-online"):ie(a,"networkstatus-offline"));c(g);ya(h);break;case 2:wa(h),g=!1,h.o(3)}})})}
;function pe(){this.data_=[];this.h=-1}
pe.prototype.set=function(a,b){b=void 0===b?!0:b;0<=a&&52>a&&Number.isInteger(a)&&this.data_[a]!==b&&(this.data_[a]=b,this.h=-1)};
pe.prototype.get=function(a){return!!this.data_[a]};
function qe(a){-1===a.h&&(a.h=ab(a.data_,function(b,c,d){return c?b+Math.pow(2,d):b},0));
return a.h}
;function re(a,b){this.j=a;this.l=b;this.i=0;this.h=null}
re.prototype.get=function(){if(0<this.i){this.i--;var a=this.h;this.h=a.next;a.next=null}else a=this.j();return a};
function se(a,b){a.l(b);100>a.i&&(a.i++,b.next=a.h,a.h=b)}
;var te;function ue(){var a=A.MessageChannel;"undefined"===typeof a&&"undefined"!==typeof window&&window.postMessage&&window.addEventListener&&!E("Presto")&&(a=function(){var e=gd();e.style.display="none";document.documentElement.appendChild(e);var f=e.contentWindow;e=f.document;e.open();e.close();var g="callImmediate"+Math.random(),h="file:"==f.location.protocol?"*":f.location.protocol+"//"+f.location.host;e=Ta(function(k){if(("*"==h||k.origin==h)&&k.data==g)this.port1.onmessage()},this);
f.addEventListener("message",e,!1);this.port1={};this.port2={postMessage:function(){f.postMessage(g,h)}}});
if("undefined"!==typeof a&&!E("Trident")&&!E("MSIE")){var b=new a,c={},d=c;b.port1.onmessage=function(){if(void 0!==c.next){c=c.next;var e=c.Ia;c.Ia=null;e()}};
return function(e){d.next={Ia:e};d=d.next;b.port2.postMessage(0)}}return function(e){A.setTimeout(e,0)}}
;function ve(a){A.setTimeout(function(){throw a;},0)}
;function we(){this.i=this.h=null}
we.prototype.add=function(a,b){var c=xe.get();c.set(a,b);this.i?this.i.next=c:this.h=c;this.i=c};
we.prototype.remove=function(){var a=null;this.h&&(a=this.h,this.h=this.h.next,this.h||(this.i=null),a.next=null);return a};
var xe=new re(function(){return new ye},function(a){return a.reset()});
function ye(){this.next=this.scope=this.h=null}
ye.prototype.set=function(a,b){this.h=a;this.scope=b;this.next=null};
ye.prototype.reset=function(){this.next=this.scope=this.h=null};function ze(a,b){Be||Ce();De||(Be(),De=!0);Ee.add(a,b)}
var Be;function Ce(){if(A.Promise&&A.Promise.resolve){var a=A.Promise.resolve(void 0);Be=function(){a.then(Fe)}}else Be=function(){var b=Fe;
"function"!==typeof A.setImmediate||A.Window&&A.Window.prototype&&!E("Edge")&&A.Window.prototype.setImmediate==A.setImmediate?(te||(te=ue()),te(b)):A.setImmediate(b)}}
var De=!1,Ee=new we;function Fe(){for(var a;a=Ee.remove();){try{a.h.call(a.scope)}catch(b){ve(b)}se(xe,a)}De=!1}
;function Ge(a,b){this.h=a[A.Symbol.iterator]();this.i=b}
Ge.prototype[Symbol.iterator]=function(){return this};
Ge.prototype.next=function(){var a=this.h.next();return{value:a.done?void 0:this.i.call(void 0,a.value),done:a.done}};
function He(a,b){return new Ge(a,b)}
;function Ie(){this.blockSize=-1}
;function Je(){this.blockSize=-1;this.blockSize=64;this.h=[];this.m=[];this.v=[];this.j=[];this.j[0]=128;for(var a=1;a<this.blockSize;++a)this.j[a]=0;this.l=this.i=0;this.reset()}
Ua(Je,Ie);Je.prototype.reset=function(){this.h[0]=1732584193;this.h[1]=4023233417;this.h[2]=2562383102;this.h[3]=271733878;this.h[4]=3285377520;this.l=this.i=0};
function Ke(a,b,c){c||(c=0);var d=a.v;if("string"===typeof b)for(var e=0;16>e;e++)d[e]=b.charCodeAt(c)<<24|b.charCodeAt(c+1)<<16|b.charCodeAt(c+2)<<8|b.charCodeAt(c+3),c+=4;else for(e=0;16>e;e++)d[e]=b[c]<<24|b[c+1]<<16|b[c+2]<<8|b[c+3],c+=4;for(e=16;80>e;e++){var f=d[e-3]^d[e-8]^d[e-14]^d[e-16];d[e]=(f<<1|f>>>31)&4294967295}b=a.h[0];c=a.h[1];var g=a.h[2],h=a.h[3],k=a.h[4];for(e=0;80>e;e++){if(40>e)if(20>e){f=h^c&(g^h);var l=1518500249}else f=c^g^h,l=1859775393;else 60>e?(f=c&g|h&(c|g),l=2400959708):
(f=c^g^h,l=3395469782);f=(b<<5|b>>>27)+f+k+l+d[e]&4294967295;k=h;h=g;g=(c<<30|c>>>2)&4294967295;c=b;b=f}a.h[0]=a.h[0]+b&4294967295;a.h[1]=a.h[1]+c&4294967295;a.h[2]=a.h[2]+g&4294967295;a.h[3]=a.h[3]+h&4294967295;a.h[4]=a.h[4]+k&4294967295}
Je.prototype.update=function(a,b){if(null!=a){void 0===b&&(b=a.length);for(var c=b-this.blockSize,d=0,e=this.m,f=this.i;d<b;){if(0==f)for(;d<=c;)Ke(this,a,d),d+=this.blockSize;if("string"===typeof a)for(;d<b;){if(e[f]=a.charCodeAt(d),++f,++d,f==this.blockSize){Ke(this,e);f=0;break}}else for(;d<b;)if(e[f]=a[d],++f,++d,f==this.blockSize){Ke(this,e);f=0;break}}this.i=f;this.l+=b}};
Je.prototype.digest=function(){var a=[],b=8*this.l;56>this.i?this.update(this.j,56-this.i):this.update(this.j,this.blockSize-(this.i-56));for(var c=this.blockSize-1;56<=c;c--)this.m[c]=b&255,b/=256;Ke(this,this.m);for(c=b=0;5>c;c++)for(var d=24;0<=d;d-=8)a[b]=this.h[c]>>d&255,++b;return a};function Le(){}
Le.prototype.next=function(){return Me};
var Me={done:!0,value:void 0};function Ne(a){return{value:a,done:!1}}
Le.prototype.K=function(){return this};function Oe(a){if(a instanceof Pe||a instanceof Qe||a instanceof Re)return a;if("function"==typeof a.next)return new Pe(function(){return a});
if("function"==typeof a[Symbol.iterator])return new Pe(function(){return a[Symbol.iterator]()});
if("function"==typeof a.K)return new Pe(function(){return a.K()});
throw Error("Not an iterator or iterable.");}
function Pe(a){this.i=a}
Pe.prototype.K=function(){return new Qe(this.i())};
Pe.prototype[Symbol.iterator]=function(){return new Re(this.i())};
Pe.prototype.h=function(){return new Re(this.i())};
function Qe(a){this.i=a}
u(Qe,Le);Qe.prototype.next=function(){return this.i.next()};
Qe.prototype[Symbol.iterator]=function(){return new Re(this.i)};
Qe.prototype.h=function(){return new Re(this.i)};
function Re(a){Pe.call(this,function(){return a});
this.j=a}
u(Re,Pe);Re.prototype.next=function(){return this.j.next()};function Se(a,b){this.i={};this.h=[];this.j=this.size=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else if(a)if(a instanceof Se)for(c=Te(a),d=0;d<c.length;d++)this.set(c[d],a.get(c[d]));else for(d in a)this.set(d,a[d])}
function Te(a){Ue(a);return a.h.concat()}
m=Se.prototype;m.has=function(a){return Ve(this.i,a)};
m.equals=function(a,b){if(this===a)return!0;if(this.size!=a.size)return!1;b=b||We;Ue(this);for(var c,d=0;c=this.h[d];d++)if(!b(this.get(c),a.get(c)))return!1;return!0};
function We(a,b){return a===b}
m.isEmpty=function(){return 0==this.size};
m.clear=function(){this.i={};this.j=this.size=this.h.length=0};
m.remove=function(a){return this.delete(a)};
m.delete=function(a){return Ve(this.i,a)?(delete this.i[a],--this.size,this.j++,this.h.length>2*this.size&&Ue(this),!0):!1};
function Ue(a){if(a.size!=a.h.length){for(var b=0,c=0;b<a.h.length;){var d=a.h[b];Ve(a.i,d)&&(a.h[c++]=d);b++}a.h.length=c}if(a.size!=a.h.length){var e={};for(c=b=0;b<a.h.length;)d=a.h[b],Ve(e,d)||(a.h[c++]=d,e[d]=1),b++;a.h.length=c}}
m.get=function(a,b){return Ve(this.i,a)?this.i[a]:b};
m.set=function(a,b){Ve(this.i,a)||(this.size+=1,this.h.push(a),this.j++);this.i[a]=b};
m.forEach=function(a,b){for(var c=Te(this),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};
m.clone=function(){return new Se(this)};
m.keys=function(){return Oe(this.K(!0)).h()};
m.values=function(){return Oe(this.K(!1)).h()};
m.entries=function(){var a=this;return He(this.keys(),function(b){return[b,a.get(b)]})};
m.K=function(a){Ue(this);var b=0,c=this.j,d=this,e=new Le;e.next=function(){if(c!=d.j)throw Error("The map has changed since the iterator was created");if(b>=d.h.length)return Me;var f=d.h[b++];return Ne(a?f:d.i[f])};
return e};
function Ve(a,b){return Object.prototype.hasOwnProperty.call(a,b)}
;var Xe=A.JSON.stringify;function Ye(){var a=this;this.promise=new Promise(function(b,c){a.resolve=b;a.reject=c})}
;function Ze(a){this.h=0;this.u=void 0;this.l=this.i=this.j=null;this.m=this.v=!1;if(a!=Ya)try{var b=this;a.call(void 0,function(c){$e(b,2,c)},function(c){$e(b,3,c)})}catch(c){$e(this,3,c)}}
function af(){this.next=this.context=this.onRejected=this.i=this.h=null;this.j=!1}
af.prototype.reset=function(){this.context=this.onRejected=this.i=this.h=null;this.j=!1};
var bf=new re(function(){return new af},function(a){a.reset()});
function cf(a,b,c){var d=bf.get();d.i=a;d.onRejected=b;d.context=c;return d}
Ze.prototype.then=function(a,b,c){return df(this,"function"===typeof a?a:null,"function"===typeof b?b:null,c)};
Ze.prototype.$goog_Thenable=!0;Ze.prototype.cancel=function(a){if(0==this.h){var b=new ef(a);ze(function(){ff(this,b)},this)}};
function ff(a,b){if(0==a.h)if(a.j){var c=a.j;if(c.i){for(var d=0,e=null,f=null,g=c.i;g&&(g.j||(d++,g.h==a&&(e=g),!(e&&1<d)));g=g.next)e||(f=g);e&&(0==c.h&&1==d?ff(c,b):(f?(d=f,d.next==c.l&&(c.l=d),d.next=d.next.next):gf(c),hf(c,e,3,b)))}a.j=null}else $e(a,3,b)}
function jf(a,b){a.i||2!=a.h&&3!=a.h||kf(a);a.l?a.l.next=b:a.i=b;a.l=b}
function df(a,b,c,d){var e=cf(null,null,null);e.h=new Ze(function(f,g){e.i=b?function(h){try{var k=b.call(d,h);f(k)}catch(l){g(l)}}:f;
e.onRejected=c?function(h){try{var k=c.call(d,h);void 0===k&&h instanceof ef?g(h):f(k)}catch(l){g(l)}}:g});
e.h.j=a;jf(a,e);return e.h}
Ze.prototype.I=function(a){this.h=0;$e(this,2,a)};
Ze.prototype.O=function(a){this.h=0;$e(this,3,a)};
function $e(a,b,c){if(0==a.h){a===c&&(b=3,c=new TypeError("Promise cannot resolve to itself"));a.h=1;a:{var d=c,e=a.I,f=a.O;if(d instanceof Ze){jf(d,cf(e||Ya,f||null,a));var g=!0}else{if(d)try{var h=!!d.$goog_Thenable}catch(l){h=!1}else h=!1;if(h)d.then(e,f,a),g=!0;else{if(Ma(d))try{var k=d.then;if("function"===typeof k){lf(d,k,e,f,a);g=!0;break a}}catch(l){f.call(a,l);g=!0;break a}g=!1}}}g||(a.u=c,a.h=b,a.j=null,kf(a),3!=b||c instanceof ef||mf(a,c))}}
function lf(a,b,c,d,e){function f(k){h||(h=!0,d.call(e,k))}
function g(k){h||(h=!0,c.call(e,k))}
var h=!1;try{b.call(a,g,f)}catch(k){f(k)}}
function kf(a){a.v||(a.v=!0,ze(a.A,a))}
function gf(a){var b=null;a.i&&(b=a.i,a.i=b.next,b.next=null);a.i||(a.l=null);return b}
Ze.prototype.A=function(){for(var a;a=gf(this);)hf(this,a,this.h,this.u);this.v=!1};
function hf(a,b,c,d){if(3==c&&b.onRejected&&!b.j)for(;a&&a.m;a=a.j)a.m=!1;if(b.h)b.h.j=null,Kf(b,c,d);else try{b.j?b.i.call(b.context):Kf(b,c,d)}catch(e){Lf.call(null,e)}se(bf,b)}
function Kf(a,b,c){2==b?a.i.call(a.context,c):a.onRejected&&a.onRejected.call(a.context,c)}
function mf(a,b){a.m=!0;ze(function(){a.m&&Lf.call(null,b)})}
var Lf=ve;function ef(a){Wa.call(this,a)}
Ua(ef,Wa);ef.prototype.name="cancel";function L(a){Fd.call(this);this.u=1;this.j=[];this.m=0;this.h=[];this.i={};this.A=!!a}
Ua(L,Fd);m=L.prototype;m.subscribe=function(a,b,c){var d=this.i[a];d||(d=this.i[a]=[]);var e=this.u;this.h[e]=a;this.h[e+1]=b;this.h[e+2]=c;this.u=e+3;d.push(e);return e};
function Mf(a,b,c){var d=Nf;if(a=d.i[a]){var e=d.h;(a=a.find(function(f){return e[f+1]==b&&e[f+2]==c}))&&d.ka(a)}}
m.ka=function(a){var b=this.h[a];if(b){var c=this.i[b];0!=this.m?(this.j.push(a),this.h[a+1]=function(){}):(c&&bb(c,a),delete this.h[a],delete this.h[a+1],delete this.h[a+2])}return!!b};
m.ca=function(a,b){var c=this.i[a];if(c){for(var d=Array(arguments.length-1),e=1,f=arguments.length;e<f;e++)d[e-1]=arguments[e];if(this.A)for(e=0;e<c.length;e++){var g=c[e];Of(this.h[g+1],this.h[g+2],d)}else{this.m++;try{for(e=0,f=c.length;e<f&&!this.l;e++)g=c[e],this.h[g+1].apply(this.h[g+2],d)}finally{if(this.m--,0<this.j.length&&0==this.m)for(;c=this.j.pop();)this.ka(c)}}return 0!=e}return!1};
function Of(a,b,c){ze(function(){a.apply(b,c)})}
m.clear=function(a){if(a){var b=this.i[a];b&&(b.forEach(this.ka,this),delete this.i[a])}else this.h.length=0,this.i={}};
m.fa=function(){L.N.fa.call(this);this.clear();this.j.length=0};function Pf(a){this.h=a}
Pf.prototype.set=function(a,b){void 0===b?this.h.remove(a):this.h.set(a,Xe(b))};
Pf.prototype.get=function(a){try{var b=this.h.get(a)}catch(c){return}if(null!==b)try{return JSON.parse(b)}catch(c){throw"Storage: Invalid value was encountered";}};
Pf.prototype.remove=function(a){this.h.remove(a)};function Qf(a){this.h=a}
Ua(Qf,Pf);function Rf(a){this.data=a}
function Sf(a){return void 0===a||a instanceof Rf?a:new Rf(a)}
Qf.prototype.set=function(a,b){Qf.N.set.call(this,a,Sf(b))};
Qf.prototype.i=function(a){a=Qf.N.get.call(this,a);if(void 0===a||a instanceof Object)return a;throw"Storage: Invalid value was encountered";};
Qf.prototype.get=function(a){if(a=this.i(a)){if(a=a.data,void 0===a)throw"Storage: Invalid value was encountered";}else a=void 0;return a};function Tf(a){this.h=a}
Ua(Tf,Qf);Tf.prototype.set=function(a,b,c){if(b=Sf(b)){if(c){if(c<Date.now()){Tf.prototype.remove.call(this,a);return}b.expiration=c}b.creation=Date.now()}Tf.N.set.call(this,a,b)};
Tf.prototype.i=function(a){var b=Tf.N.i.call(this,a);if(b){var c=b.creation,d=b.expiration;if(d&&d<Date.now()||c&&c>Date.now())Tf.prototype.remove.call(this,a);else return b}};function Uf(){}
;function Vf(){}
Ua(Vf,Uf);Vf.prototype[Symbol.iterator]=function(){return Oe(this.K(!0)).h()};
Vf.prototype.clear=function(){var a=Array.from(this);a=t(a);for(var b=a.next();!b.done;b=a.next())this.remove(b.value)};function Wf(a){this.h=a}
Ua(Wf,Vf);m=Wf.prototype;m.isAvailable=function(){if(!this.h)return!1;try{return this.h.setItem("__sak","1"),this.h.removeItem("__sak"),!0}catch(a){return!1}};
m.set=function(a,b){try{this.h.setItem(a,b)}catch(c){if(0==this.h.length)throw"Storage mechanism: Storage disabled";throw"Storage mechanism: Quota exceeded";}};
m.get=function(a){a=this.h.getItem(a);if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
m.remove=function(a){this.h.removeItem(a)};
m.K=function(a){var b=0,c=this.h,d=new Le;d.next=function(){if(b>=c.length)return Me;var e=c.key(b++);if(a)return Ne(e);e=c.getItem(e);if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return Ne(e)};
return d};
m.clear=function(){this.h.clear()};
m.key=function(a){return this.h.key(a)};function Xf(){var a=null;try{a=window.localStorage||null}catch(b){}this.h=a}
Ua(Xf,Wf);function Yf(a,b){this.i=a;this.h=null;var c;if(c=Yb)c=!(9<=Number(kc));if(c){Zf||(Zf=new Se);this.h=Zf.get(a);this.h||(b?this.h=document.getElementById(b):(this.h=document.createElement("userdata"),this.h.addBehavior("#default#userData"),document.body.appendChild(this.h)),Zf.set(a,this.h));try{this.h.load(this.i)}catch(d){this.h=null}}}
Ua(Yf,Vf);var $f={".":".2E","!":".21","~":".7E","*":".2A","'":".27","(":".28",")":".29","%":"."},Zf=null;function ag(a){return"_"+encodeURIComponent(a).replace(/[.!~*'()%]/g,function(b){return $f[b]})}
m=Yf.prototype;m.isAvailable=function(){return!!this.h};
m.set=function(a,b){this.h.setAttribute(ag(a),b);bg(this)};
m.get=function(a){a=this.h.getAttribute(ag(a));if("string"!==typeof a&&null!==a)throw"Storage mechanism: Invalid value was encountered";return a};
m.remove=function(a){this.h.removeAttribute(ag(a));bg(this)};
m.K=function(a){var b=0,c=this.h.XMLDocument.documentElement.attributes,d=new Le;d.next=function(){if(b>=c.length)return Me;var e=c[b++];if(a)return Ne(decodeURIComponent(e.nodeName.replace(/\./g,"%")).slice(1));e=e.nodeValue;if("string"!==typeof e)throw"Storage mechanism: Invalid value was encountered";return Ne(e)};
return d};
m.clear=function(){for(var a=this.h.XMLDocument.documentElement,b=a.attributes.length;0<b;b--)a.removeAttribute(a.attributes[b-1].nodeName);bg(this)};
function bg(a){try{a.h.save(a.i)}catch(b){throw"Storage mechanism: Quota exceeded";}}
;function cg(a,b){this.i=a;this.h=b+"::"}
Ua(cg,Vf);cg.prototype.set=function(a,b){this.i.set(this.h+a,b)};
cg.prototype.get=function(a){return this.i.get(this.h+a)};
cg.prototype.remove=function(a){this.i.remove(this.h+a)};
cg.prototype.K=function(a){var b=this.i[Symbol.iterator](),c=this,d=new Le;d.next=function(){var e=b.next();if(e.done)return e;for(e=e.value;e.slice(0,c.h.length)!=c.h;){e=b.next();if(e.done)return e;e=e.value}return Ne(a?e.slice(c.h.length):c.i.get(e))};
return d};function dg(a){I.call(this,a)}
u(dg,I);dg.prototype.getKey=function(){return Nc(this,1)};
dg.prototype.W=function(){return Nc(this,2===Qc(this,eg)?2:-1)};
dg.prototype.setValue=function(a){return Pc(this,2,eg,a)};
var eg=[2,3,4,5,6];function fg(a){I.call(this,a)}
u(fg,I);function gg(a){I.call(this,a)}
u(gg,I);function hg(a){I.call(this,a,-1,ig)}
u(hg,I);hg.prototype.getPlayerType=function(){return Nc(this,36)};
hg.prototype.setHomeGroupInfo=function(a){return H(this,81,a)};
var ig=[9,66,24,32,86,100,101];function jg(a){I.call(this,a,-1,kg)}
u(jg,I);var kg=[15,26,28];function lg(a){I.call(this,a)}
u(lg,I);lg.prototype.setToken=function(a){return G(this,2,a)};function mg(a){I.call(this,a,-1,ng)}
u(mg,I);mg.prototype.setSafetyMode=function(a){return G(this,5,a)};
var ng=[12];function og(a){I.call(this,a,-1,pg)}
u(og,I);var pg=[12];function qg(a){I.call(this,a,-1,rg)}
u(qg,I);function sg(a){I.call(this,a)}
u(sg,I);sg.prototype.getKey=function(){return Vc(this,1)};
sg.prototype.W=function(){return Vc(this,2)};
sg.prototype.setValue=function(a){return G(this,2,a)};
var rg=[4,5];function tg(a){I.call(this,a)}
u(tg,I);function ug(a){I.call(this,a)}
u(ug,I);var vg=[2,3];function wg(a){I.call(this,a)}
u(wg,I);function xg(a){I.call(this,a)}
u(xg,I);function yg(a){I.call(this,a)}
u(yg,I);function zg(a){I.call(this,a,-1,Ag)}
u(zg,I);var Ag=[10,17];function Bg(a){I.call(this,a)}
u(Bg,I);function Cg(a){I.call(this,a)}
u(Cg,I);function Dg(a){I.call(this,a)}
u(Dg,I);function Eg(a){I.call(this,a,431)}
u(Eg,I);
var Fg=[23,24,11,6,7,5,2,3,20,21,28,32,37,229,241,45,59,225,288,72,73,78,208,156,202,215,74,76,79,80,111,85,91,97,100,102,105,119,126,127,136,146,157,158,159,163,164,168,176,222,383,177,178,179,411,184,188,189,190,191,193,194,195,196,198,199,200,201,203,204,205,206,258,259,260,261,209,226,227,232,233,234,240,247,248,251,254,255,270,278,291,293,300,304,308,309,310,311,313,314,319,321,323,324,328,330,331,332,337,338,340,344,348,350,351,352,353,354,355,356,357,358,361,363,364,368,369,370,373,374,375,
378,380,381,388,389,403,412,429,413,414,415,416,417,418,430,423,424,425,426,427,117];function Gg(a){I.call(this,a)}
u(Gg,I);function Hg(a){I.call(this,a)}
u(Hg,I);Hg.prototype.setVideoId=function(a){return Pc(this,1,Ig,a)};
Hg.prototype.getPlaylistId=function(){return Nc(this,2===Qc(this,Ig)?2:-1)};
var Ig=[1,2];function Jg(a){I.call(this,a,-1,Kg)}
u(Jg,I);var Kg=[3];function Lg(a){I.call(this,a,1)}
u(Lg,I);function Mg(a){I.call(this,a)}
u(Mg,I);var Ng;Ng=new function(a,b){this.h=a;this.fieldName=b;this.isRepeated=0;this.i=cd}(406606992,{Ob:0},Mg);function Og(){Mg.apply(this,arguments)}
u(Og,Mg);Ed(Og);var Pg=A.window,Qg,Rg,Sg=(null==Pg?void 0:null==(Qg=Pg.yt)?void 0:Qg.config_)||(null==Pg?void 0:null==(Rg=Pg.ytcfg)?void 0:Rg.data_)||{},Tg,Ug=(null==Pg?void 0:null==(Tg=Pg.ytcfg)?void 0:Tg.obfuscatedData_)||[];function Vg(){Lg.apply(this,arguments)}
u(Vg,Lg);Ed(Vg);var Wg=new Vg(Ug),Xg=Sg.EXPERIMENT_FLAGS;if(!Xg||!Xg.jspb_i18n_extension){var Yg=new Og;Ng.i(Wg,Yg)}C("yt.config_",Sg);C("yt.configJspb_",Ug);function Zg(){var a=arguments;1<a.length?Sg[a[0]]=a[1]:1===a.length&&Object.assign(Sg,a[0])}
function O(a,b){return a in Sg?Sg[a]:b}
function $g(){return O("LATEST_ECATCHER_SERVICE_TRACKING_PARAMS")}
function ah(){var a=Sg.EXPERIMENT_FLAGS;return a?a.web_disable_gel_stp_ecatcher_killswitch:void 0}
;var bh=[];function ch(a){bh.forEach(function(b){return b(a)})}
function dh(a){return a&&window.yterr?function(){try{return a.apply(this,arguments)}catch(b){eh(b)}}:a}
function eh(a,b,c,d){var e=B("yt.logging.errors.log");e?e(a,"ERROR",b,c,d):(e=O("ERRORS",[]),e.push([a,"ERROR",b,c,d]),Zg("ERRORS",e));ch(a)}
function fh(a,b,c,d){var e=B("yt.logging.errors.log");e?e(a,"WARNING",b,c,d):(e=O("ERRORS",[]),e.push([a,"WARNING",b,c,d]),Zg("ERRORS",e))}
;var gh=0;C("ytDomDomGetNextId",B("ytDomDomGetNextId")||function(){return++gh});var hh={stopImmediatePropagation:1,stopPropagation:1,preventMouseEvent:1,preventManipulation:1,preventDefault:1,layerX:1,layerY:1,screenX:1,screenY:1,scale:1,rotation:1,webkitMovementX:1,webkitMovementY:1};
function ih(a){this.type="";this.state=this.source=this.data=this.currentTarget=this.relatedTarget=this.target=null;this.charCode=this.keyCode=0;this.metaKey=this.shiftKey=this.ctrlKey=this.altKey=!1;this.rotation=this.clientY=this.clientX=0;this.scale=1;this.changedTouches=this.touches=null;try{if(a=a||window.event){this.event=a;for(var b in a)b in hh||(this[b]=a[b]);this.scale=a.scale;this.rotation=a.rotation;var c=a.target||a.srcElement;c&&3==c.nodeType&&(c=c.parentNode);this.target=c;var d=a.relatedTarget;
if(d)try{d=d.nodeName?d:null}catch(e){d=null}else"mouseover"==this.type?d=a.fromElement:"mouseout"==this.type&&(d=a.toElement);this.relatedTarget=d;this.clientX=void 0!=a.clientX?a.clientX:a.pageX;this.clientY=void 0!=a.clientY?a.clientY:a.pageY;this.keyCode=a.keyCode?a.keyCode:a.which;this.charCode=a.charCode||("keypress"==this.type?this.keyCode:0);this.altKey=a.altKey;this.ctrlKey=a.ctrlKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey}}catch(e){}}
ih.prototype.preventDefault=function(){this.event&&(this.event.returnValue=!1,this.event.preventDefault&&this.event.preventDefault())};
ih.prototype.stopPropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopPropagation&&this.event.stopPropagation())};
ih.prototype.stopImmediatePropagation=function(){this.event&&(this.event.cancelBubble=!0,this.event.stopImmediatePropagation&&this.event.stopImmediatePropagation())};var ib=A.ytEventsEventsListeners||{};C("ytEventsEventsListeners",ib);var jh=A.ytEventsEventsCounter||{count:0};C("ytEventsEventsCounter",jh);
function kh(a,b,c,d){d=void 0===d?{}:d;a.addEventListener&&("mouseenter"!=b||"onmouseenter"in document?"mouseleave"!=b||"onmouseenter"in document?"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"):b="mouseout":b="mouseover");return hb(function(e){var f="boolean"===typeof e[4]&&e[4]==!!d,g=Ma(e[4])&&Ma(d)&&pb(e[4],d);return!!e.length&&e[0]==a&&e[1]==b&&e[2]==c&&(f||g)})}
function lh(a){a&&("string"==typeof a&&(a=[a]),D(a,function(b){if(b in ib){var c=ib[b],d=c[0],e=c[1],f=c[3];c=c[4];d.removeEventListener?mh()||"boolean"===typeof c?d.removeEventListener(e,f,c):d.removeEventListener(e,f,!!c.capture):d.detachEvent&&d.detachEvent("on"+e,f);delete ib[b]}}))}
var mh=Za(function(){var a=!1;try{var b=Object.defineProperty({},"capture",{get:function(){a=!0}});
window.addEventListener("test",null,b)}catch(c){}return a});
function nh(a,b,c){var d=void 0===d?{}:d;if(a&&(a.addEventListener||a.attachEvent)){var e=kh(a,b,c,d);if(!e){e=++jh.count+"";var f=!("mouseenter"!=b&&"mouseleave"!=b||!a.addEventListener||"onmouseenter"in document);var g=f?function(h){h=new ih(h);if(!hd(h.relatedTarget,function(k){return k==a}))return h.currentTarget=a,h.type=b,c.call(a,h)}:function(h){h=new ih(h);
h.currentTarget=a;return c.call(a,h)};
g=dh(g);a.addEventListener?("mouseenter"==b&&f?b="mouseover":"mouseleave"==b&&f?b="mouseout":"mousewheel"==b&&"MozBoxSizing"in document.documentElement.style&&(b="MozMousePixelScroll"),mh()||"boolean"===typeof d?a.addEventListener(b,g,d):a.addEventListener(b,g,!!d.capture)):a.attachEvent("on"+b,g);ib[e]=[a,b,c,g,d]}}}
;function oh(a,b){"function"===typeof a&&(a=dh(a));return window.setTimeout(a,b)}
function ph(a){"function"===typeof a&&(a=dh(a));return window.setInterval(a,250)}
;var qh=/^[\w.]*$/,rh={q:!0,search_query:!0};function sh(a,b){b=a.split(b);for(var c={},d=0,e=b.length;d<e;d++){var f=b[d].split("=");if(1==f.length&&f[0]||2==f.length)try{var g=th(f[0]||""),h=th(f[1]||"");g in c?Array.isArray(c[g])?fb(c[g],h):c[g]=[c[g],h]:c[g]=h}catch(q){var k=q,l=f[0],n=String(sh);k.args=[{key:l,value:f[1],query:a,method:uh==n?"unchanged":n}];rh.hasOwnProperty(l)||fh(k)}}return c}
var uh=String(sh);function vh(a){var b=[];gb(a,function(c,d){var e=encodeURIComponent(String(d)),f;Array.isArray(c)?f=c:f=[c];D(f,function(g){""==g?b.push(e):b.push(e+"="+encodeURIComponent(String(g)))})});
return b.join("&")}
function wh(a){"?"==a.charAt(0)&&(a=a.substr(1));return sh(a,"&")}
function xh(a,b,c){var d=a.split("#",2);a=d[0];d=1<d.length?"#"+d[1]:"";var e=a.split("?",2);a=e[0];e=wh(e[1]||"");for(var f in b)!c&&null!==e&&f in e||(e[f]=b[f]);b=a;a=Sb(e);a?(c=b.indexOf("#"),0>c&&(c=b.length),f=b.indexOf("?"),0>f||f>c?(f=c,e=""):e=b.substring(f+1,c),b=[b.slice(0,f),e,b.slice(c)],c=b[1],b[1]=a?c?c+"&"+a:a:c,a=b[0]+(b[1]?"?"+b[1]:"")+b[2]):a=b;return a+d}
function yh(a){if(!b)var b=window.location.href;var c=a.match(Jb)[1]||null,d=Lb(a);c&&d?(a=a.match(Jb),b=b.match(Jb),a=a[3]==b[3]&&a[1]==b[1]&&a[4]==b[4]):a=d?Lb(b)==d&&(Number(b.match(Jb)[4]||null)||null)==(Number(a.match(Jb)[4]||null)||null):!0;return a}
function th(a){return a&&a.match(qh)?a:decodeURIComponent(a.replace(/\+/g," "))}
;function P(a){a=zh(a);return"string"===typeof a&&"false"===a?!1:!!a}
function Ah(a,b){a=zh(a);return void 0===a&&void 0!==b?b:Number(a||0)}
function zh(a){var b=O("EXPERIMENTS_FORCED_FLAGS",{});return void 0!==b[a]?b[a]:O("EXPERIMENT_FLAGS",{})[a]}
function Bh(){var a=[],b=O("EXPERIMENTS_FORCED_FLAGS",{});for(c in b)a.push({key:c,value:String(b[c])});var c=O("EXPERIMENT_FLAGS",{});for(var d in c)d.startsWith("force_")&&void 0===b[d]&&a.push({key:d,value:String(c[d])});return a}
;function Ch(a){var b=Dh;a=void 0===a?B("yt.ads.biscotti.lastId_")||"":a;var c=Object,d=c.assign,e={};e.dt=od;e.flash="0";a:{try{var f=b.h.top.location.href}catch(ka){f=2;break a}f=f?f===b.i.location.href?0:1:2}e=(e.frm=f,e);try{e.u_tz=-(new Date).getTimezoneOffset();var g=void 0===g?ed:g;try{var h=g.history.length}catch(ka){h=0}e.u_his=h;var k;e.u_h=null==(k=ed.screen)?void 0:k.height;var l;e.u_w=null==(l=ed.screen)?void 0:l.width;var n;e.u_ah=null==(n=ed.screen)?void 0:n.availHeight;var q;e.u_aw=
null==(q=ed.screen)?void 0:q.availWidth;var v;e.u_cd=null==(v=ed.screen)?void 0:v.colorDepth}catch(ka){}h=b.h;try{var p=h.screenX;var z=h.screenY}catch(ka){}try{var y=h.outerWidth;var F=h.outerHeight}catch(ka){}try{var M=h.innerWidth;var K=h.innerHeight}catch(ka){}try{var N=h.screenLeft;var cb=h.screenTop}catch(ka){}try{M=h.innerWidth,K=h.innerHeight}catch(ka){}try{var hc=h.screen.availWidth;var Ae=h.screen.availTop}catch(ka){}p=[N,cb,p,z,hc,Ae,y,F,M,K];z=b.h.top;try{var Z=(z||window).document,S=
"CSS1Compat"==Z.compatMode?Z.documentElement:Z.body;var U=(new fd(S.clientWidth,S.clientHeight)).round()}catch(ka){U=new fd(-12245933,-12245933)}Z=U;U={};var V=void 0===V?A:V;S=new pe;V.SVGElement&&V.document.createElementNS&&S.set(0);z=md();z["allow-top-navigation-by-user-activation"]&&S.set(1);z["allow-popups-to-escape-sandbox"]&&S.set(2);V.crypto&&V.crypto.subtle&&S.set(3);V.TextDecoder&&V.TextEncoder&&S.set(4);V=qe(S);U.bc=V;U.bih=Z.height;U.biw=Z.width;U.brdim=p.join();b=b.i;b=(U.vis=b.prerendering?
3:{visible:1,hidden:2,prerender:3,preview:4,unloaded:5}[b.visibilityState||b.webkitVisibilityState||b.mozVisibilityState||""]||0,U.wgl=!!ed.WebGLRenderingContext,U);c=d.call(c,e,b);c.ca_type="image";a&&(c.bid=a);return c}
var Dh=new function(){var a=window.document;this.h=window;this.i=a};
C("yt.ads_.signals_.getAdSignalsString",function(a){return vh(Ch(a))});Date.now();var Eh="XMLHttpRequest"in A?function(){return new XMLHttpRequest}:null;
function Fh(){if(!Eh)return null;var a=Eh();return"open"in a?a:null}
;var Gh={Authorization:"AUTHORIZATION","X-Goog-EOM-Visitor-Id":"EOM_VISITOR_DATA","X-Goog-Visitor-Id":"SANDBOXED_VISITOR_ID","X-Youtube-Domain-Admin-State":"DOMAIN_ADMIN_STATE","X-Youtube-Chrome-Connected":"CHROME_CONNECTED_HEADER","X-YouTube-Client-Name":"INNERTUBE_CONTEXT_CLIENT_NAME","X-YouTube-Client-Version":"INNERTUBE_CONTEXT_CLIENT_VERSION","X-YouTube-Delegation-Context":"INNERTUBE_CONTEXT_SERIALIZED_DELEGATION_CONTEXT","X-YouTube-Device":"DEVICE","X-Youtube-Identity-Token":"ID_TOKEN","X-YouTube-Page-CL":"PAGE_CL",
"X-YouTube-Page-Label":"PAGE_BUILD_LABEL","X-YouTube-Variants-Checksum":"VARIANTS_CHECKSUM"},Hh="app debugcss debugjs expflag force_ad_params force_ad_encrypted force_viral_ad_response_params forced_experiments innertube_snapshots innertube_goldens internalcountrycode internalipoverride absolute_experiments conditional_experiments sbb sr_bns_address".split(" ").concat(fa(qd)),Ih=!1;
function Jh(a,b){b=void 0===b?{}:b;var c=yh(a),d=P("web_ajax_ignore_global_headers_if_set"),e;for(e in Gh){var f=O(Gh[e]);!f||!c&&Lb(a)||d&&void 0!==b[e]||!P("enable_web_eom_visitor_data")&&"X-Goog-EOM-Visitor-Id"===e||(b[e]=f)}"X-Goog-EOM-Visitor-Id"in b&&"X-Goog-Visitor-Id"in b&&delete b["X-Goog-Visitor-Id"];if(c||!Lb(a))b["X-YouTube-Utc-Offset"]=String(-(new Date).getTimezoneOffset());if(c||!Lb(a)){try{var g=(new Intl.DateTimeFormat).resolvedOptions().timeZone}catch(h){}g&&(b["X-YouTube-Time-Zone"]=
g)}if(c||!Lb(a))b["X-YouTube-Ad-Signals"]=vh(Ch());return b}
function Kh(a){var b=window.location.search,c=Lb(a);P("debug_handle_relative_url_for_query_forward_killswitch")||c||!yh(a)||(c=document.location.hostname);var d=Kb(a.match(Jb)[5]||null);d=(c=c&&(c.endsWith("youtube.com")||c.endsWith("youtube-nocookie.com")))&&d&&d.startsWith("/api/");if(!c||d)return a;var e=wh(b),f={};D(Hh,function(g){e[g]&&(f[g]=e[g])});
return xh(a,f||{},!1)}
function Lh(a,b){var c=b.format||"JSON";a=Mh(a,b);var d=Nh(a,b),e=!1,f=Oh(a,function(k){if(!e){e=!0;h&&window.clearTimeout(h);a:switch(k&&"status"in k?k.status:-1){case 200:case 201:case 202:case 203:case 204:case 205:case 206:case 304:var l=!0;break a;default:l=!1}var n=null,q=400<=k.status&&500>k.status,v=500<=k.status&&600>k.status;if(l||q||v)n=Ph(a,c,k,b.convertToSafeHtml);if(l)a:if(k&&204==k.status)l=!0;else{switch(c){case "XML":l=0==parseInt(n&&n.return_code,10);break a;case "RAW":l=!0;break a}l=
!!n}n=n||{};q=b.context||A;l?b.onSuccess&&b.onSuccess.call(q,k,n):b.onError&&b.onError.call(q,k,n);b.onFinish&&b.onFinish.call(q,k,n)}},b.method,d,b.headers,b.responseType,b.withCredentials);
d=b.timeout||0;if(b.onTimeout&&0<d){var g=b.onTimeout;var h=oh(function(){e||(e=!0,f.abort(),window.clearTimeout(h),g.call(b.context||A,f))},d)}}
function Mh(a,b){b.includeDomain&&(a=document.location.protocol+"//"+document.location.hostname+(document.location.port?":"+document.location.port:"")+a);var c=O("XSRF_FIELD_NAME");if(b=b.urlParams)b[c]&&delete b[c],a=xh(a,b||{},!0);return a}
function Nh(a,b){var c=O("XSRF_FIELD_NAME"),d=O("XSRF_TOKEN"),e=b.postBody||"",f=b.postParams,g=O("XSRF_FIELD_NAME"),h;b.headers&&(h=b.headers["Content-Type"]);b.excludeXsrf||Lb(a)&&!b.withCredentials&&Lb(a)!=document.location.hostname||"POST"!=b.method||h&&"application/x-www-form-urlencoded"!=h||b.postParams&&b.postParams[g]||(f||(f={}),f[c]=d);f&&"string"===typeof e&&(e=wh(e),sb(e,f),e=b.postBodyFormat&&"JSON"==b.postBodyFormat?JSON.stringify(e):Sb(e));if(!(a=e)&&(a=f)){a:{for(var k in f){f=!1;
break a}f=!0}a=!f}!Ih&&a&&"POST"!=b.method&&(Ih=!0,eh(Error("AJAX request with postData should use POST")));return e}
function Ph(a,b,c,d){var e=null;switch(b){case "JSON":try{var f=c.responseText}catch(g){throw d=Error("Error reading responseText"),d.params=a,fh(d),g;}a=c.getResponseHeader("Content-Type")||"";f&&0<=a.indexOf("json")&&(")]}'\n"===f.substring(0,5)&&(f=f.substring(5)),e=JSON.parse(f));break;case "XML":if(a=(a=c.responseXML)?Qh(a):null)e={},D(a.getElementsByTagName("*"),function(g){e[g.tagName]=Rh(g)})}d&&Sh(e);
return e}
function Sh(a){if(Ma(a))for(var b in a){var c;(c="html_content"==b)||(c=b.length-5,c=0<=c&&b.indexOf("_html",c)==c);if(c){c=b;vb("HTML that is escaped and sanitized server-side and passed through yt.net.ajax");var d=a[b];if(void 0===tb){var e=null;var f=A.trustedTypes;if(f&&f.createPolicy){try{e=f.createPolicy("goog#html",{createHTML:Va,createScript:Va,createScriptURL:Va})}catch(g){A.console&&A.console.error(g.message)}tb=e}else tb=e}d=(e=tb)?e.createHTML(d):d;a[c]=new Ib(d)}else Sh(a[b])}}
function Qh(a){return a?(a=("responseXML"in a?a.responseXML:a).getElementsByTagName("root"))&&0<a.length?a[0]:null:null}
function Rh(a){var b="";D(a.childNodes,function(c){b+=c.nodeValue});
return b}
function Oh(a,b,c,d,e,f,g){function h(){4==(k&&"readyState"in k?k.readyState:0)&&b&&dh(b)(k)}
c=void 0===c?"GET":c;d=void 0===d?"":d;var k=Fh();if(!k)return null;"onloadend"in k?k.addEventListener("loadend",h,!1):k.onreadystatechange=h;P("debug_forward_web_query_parameters")&&(a=Kh(a));k.open(c,a,!0);f&&(k.responseType=f);g&&(k.withCredentials=!0);c="POST"==c&&(void 0===window.FormData||!(d instanceof FormData));if(e=Jh(a,e))for(var l in e)k.setRequestHeader(l,e[l]),"content-type"==l.toLowerCase()&&(c=!1);c&&k.setRequestHeader("Content-Type","application/x-www-form-urlencoded");k.send(d);
return k}
;var Th={Jb:"WEB_DISPLAY_MODE_UNKNOWN",Fb:"WEB_DISPLAY_MODE_BROWSER",Hb:"WEB_DISPLAY_MODE_MINIMAL_UI",Ib:"WEB_DISPLAY_MODE_STANDALONE",Gb:"WEB_DISPLAY_MODE_FULLSCREEN"};function Uh(){if(!A.matchMedia)return"WEB_DISPLAY_MODE_UNKNOWN";try{return A.matchMedia("(display-mode: standalone)").matches?"WEB_DISPLAY_MODE_STANDALONE":A.matchMedia("(display-mode: minimal-ui)").matches?"WEB_DISPLAY_MODE_MINIMAL_UI":A.matchMedia("(display-mode: fullscreen)").matches?"WEB_DISPLAY_MODE_FULLSCREEN":A.matchMedia("(display-mode: browser)").matches?"WEB_DISPLAY_MODE_BROWSER":"WEB_DISPLAY_MODE_UNKNOWN"}catch(a){return"WEB_DISPLAY_MODE_UNKNOWN"}}
;C("ytglobal.prefsUserPrefsPrefs_",B("ytglobal.prefsUserPrefsPrefs_")||{});var Vh={bluetooth:"CONN_DISCO",cellular:"CONN_CELLULAR_UNKNOWN",ethernet:"CONN_WIFI",none:"CONN_NONE",wifi:"CONN_WIFI",wimax:"CONN_CELLULAR_4G",other:"CONN_UNKNOWN",unknown:"CONN_UNKNOWN","slow-2g":"CONN_CELLULAR_2G","2g":"CONN_CELLULAR_2G","3g":"CONN_CELLULAR_3G","4g":"CONN_CELLULAR_4G"},Wh={CONN_DEFAULT:0,CONN_UNKNOWN:1,CONN_NONE:2,CONN_WIFI:3,CONN_CELLULAR_2G:4,CONN_CELLULAR_3G:5,CONN_CELLULAR_4G:6,CONN_CELLULAR_UNKNOWN:7,CONN_DISCO:8,CONN_CELLULAR_5G:9,CONN_WIFI_METERED:10,CONN_CELLULAR_5G_SA:11,
CONN_CELLULAR_5G_NSA:12,CONN_INVALID:31},Xh={EFFECTIVE_CONNECTION_TYPE_UNKNOWN:0,EFFECTIVE_CONNECTION_TYPE_OFFLINE:1,EFFECTIVE_CONNECTION_TYPE_SLOW_2G:2,EFFECTIVE_CONNECTION_TYPE_2G:3,EFFECTIVE_CONNECTION_TYPE_3G:4,EFFECTIVE_CONNECTION_TYPE_4G:5},Yh={"slow-2g":"EFFECTIVE_CONNECTION_TYPE_SLOW_2G","2g":"EFFECTIVE_CONNECTION_TYPE_2G","3g":"EFFECTIVE_CONNECTION_TYPE_3G","4g":"EFFECTIVE_CONNECTION_TYPE_4G"};function Zh(){var a=A.navigator;return a?a.connection:void 0}
;function $h(){return"INNERTUBE_API_KEY"in Sg&&"INNERTUBE_API_VERSION"in Sg}
function ai(){return{innertubeApiKey:O("INNERTUBE_API_KEY"),innertubeApiVersion:O("INNERTUBE_API_VERSION"),za:O("INNERTUBE_CONTEXT_CLIENT_CONFIG_INFO"),Na:O("INNERTUBE_CONTEXT_CLIENT_NAME","WEB"),kb:O("INNERTUBE_CONTEXT_CLIENT_NAME",1),innertubeContextClientVersion:O("INNERTUBE_CONTEXT_CLIENT_VERSION"),Pa:O("INNERTUBE_CONTEXT_HL"),Oa:O("INNERTUBE_CONTEXT_GL"),lb:O("INNERTUBE_HOST_OVERRIDE")||"",nb:!!O("INNERTUBE_USE_THIRD_PARTY_AUTH",!1),mb:!!O("INNERTUBE_OMIT_API_KEY_WHEN_AUTH_HEADER_IS_PRESENT",
!1),appInstallData:O("SERIALIZED_CLIENT_CONFIG_DATA")}}
function bi(a){var b={client:{hl:a.Pa,gl:a.Oa,clientName:a.Na,clientVersion:a.innertubeContextClientVersion,configInfo:a.za}};navigator.userAgent&&(b.client.userAgent=String(navigator.userAgent));var c=A.devicePixelRatio;c&&1!=c&&(b.client.screenDensityFloat=String(c));c=O("EXPERIMENTS_TOKEN","");""!==c&&(b.client.experimentsToken=c);c=Bh();0<c.length&&(b.request={internalExperimentFlags:c});ci(a,void 0,b);di(void 0,b);ei(a,void 0,b);fi(void 0,b);O("DELEGATED_SESSION_ID")&&!P("pageid_as_header_web")&&
(b.user={onBehalfOfUser:O("DELEGATED_SESSION_ID")});a=Object;c=a.assign;for(var d=b.client,e={},f=t(Object.entries(wh(O("DEVICE","")))),g=f.next();!g.done;g=f.next()){var h=t(g.value);g=h.next().value;h=h.next().value;"cbrand"===g?e.deviceMake=h:"cmodel"===g?e.deviceModel=h:"cbr"===g?e.browserName=h:"cbrver"===g?e.browserVersion=h:"cos"===g?e.osName=h:"cosver"===g?e.osVersion=h:"cplatform"===g&&(e.platform=h)}b.client=c.call(a,d,e);return b}
function gi(a){var b=new og,c=new hg;G(c,1,a.Pa);G(c,2,a.Oa);G(c,16,a.kb);G(c,17,a.innertubeContextClientVersion);if(a.za){var d=a.za,e=new fg;d.coldConfigData&&G(e,1,d.coldConfigData);d.appInstallData&&G(e,6,d.appInstallData);d.coldHashData&&G(e,3,d.coldHashData);d.hotHashData&&G(e,5,d.hotHashData);H(c,62,e)}(d=A.devicePixelRatio)&&1!=d&&G(c,65,d);d=O("EXPERIMENTS_TOKEN","");""!==d&&G(c,54,d);d=Bh();if(0<d.length){e=new jg;for(var f=0;f<d.length;f++){var g=new dg;G(g,1,d[f].key);g.setValue(d[f].value);
Uc(e,15,dg,g)}H(b,5,e)}ci(a,c);di(c);ei(a,c);fi(c);O("DELEGATED_SESSION_ID")&&!P("pageid_as_header_web")&&(a=new mg,G(a,3,O("DELEGATED_SESSION_ID")));a=t(Object.entries(wh(O("DEVICE",""))));for(d=a.next();!d.done;d=a.next())e=t(d.value),d=e.next().value,e=e.next().value,"cbrand"===d?G(c,12,e):"cmodel"===d?G(c,13,e):"cbr"===d?G(c,87,e):"cbrver"===d?G(c,88,e):"cos"===d?G(c,18,e):"cosver"===d?G(c,19,e):"cplatform"===d&&G(c,42,e);H(b,1,c);return b}
function ci(a,b,c){a=a.Na;if("WEB"===a||"MWEB"===a||1===a||2===a)if(b){c=Rc(b,gg,96)||new gg;var d=Uh();d=Object.keys(Th).indexOf(d);d=-1===d?null:d;null!==d&&G(c,3,d);H(b,96,c)}else c&&(c.client.mainAppWebInfo=null!=(d=c.client.mainAppWebInfo)?d:{},c.client.mainAppWebInfo.webDisplayMode=Uh())}
function di(a,b){var c;if(P("web_log_memory_total_kbytes")&&(null==(c=A.navigator)?0:c.deviceMemory)){var d;c=null==(d=A.navigator)?void 0:d.deviceMemory;a?G(a,95,1E6*c):b&&(b.client.memoryTotalKbytes=""+1E6*c)}}
function ei(a,b,c){if(a.appInstallData)if(b){var d;c=null!=(d=Rc(b,fg,62))?d:new fg;G(c,6,a.appInstallData);H(b,62,c)}else c&&(c.client.configInfo=c.client.configInfo||{},c.client.configInfo.appInstallData=a.appInstallData)}
function fi(a,b){a:{var c=Zh();if(c){var d=Vh[c.type||"unknown"]||"CONN_UNKNOWN";c=Vh[c.effectiveType||"unknown"]||"CONN_UNKNOWN";"CONN_CELLULAR_UNKNOWN"===d&&"CONN_UNKNOWN"!==c&&(d=c);if("CONN_UNKNOWN"!==d)break a;if("CONN_UNKNOWN"!==c){d=c;break a}}d=void 0}d&&(a?G(a,61,Wh[d]):b&&(b.client.connectionType=d));P("web_log_effective_connection_type")&&(d=Zh(),d=null!=d&&d.effectiveType?Yh.hasOwnProperty(d.effectiveType)?Yh[d.effectiveType]:"EFFECTIVE_CONNECTION_TYPE_UNKNOWN":void 0,d&&(a?G(a,94,Xh[d]):
b&&(b.client.effectiveConnectionType=d)))}
function hi(a,b,c){c=void 0===c?{}:c;var d={};P("enable_web_eom_visitor_data")&&O("EOM_VISITOR_DATA")?d={"X-Goog-EOM-Visitor-Id":O("EOM_VISITOR_DATA")}:d={"X-Goog-Visitor-Id":c.visitorData||O("VISITOR_DATA","")};if(b&&b.includes("www.youtube-nocookie.com"))return d;(b=c.Lb||O("AUTHORIZATION"))||(a?b="Bearer "+B("gapi.auth.getToken")().Kb:b=Dd([]));b&&(d.Authorization=b,d["X-Goog-AuthUser"]=O("SESSION_INDEX",0),P("pageid_as_header_web")&&(d["X-Goog-PageId"]=O("DELEGATED_SESSION_ID")));return d}
;function ii(a){a=Object.assign({},a);delete a.Authorization;var b=Dd();if(b){var c=new Je;c.update(O("INNERTUBE_API_KEY"));c.update(b);a.hash=tc(c.digest(),3)}return a}
;function ji(a){var b=new Xf;(b=b.isAvailable()?a?new cg(b,a):b:null)||(a=new Yf(a||"UserDataSharedStore"),b=a.isAvailable()?a:null);this.h=(a=b)?new Tf(a):null;this.i=document.domain||window.location.hostname}
ji.prototype.set=function(a,b,c,d){c=c||31104E3;this.remove(a);if(this.h)try{this.h.set(a,b,Date.now()+1E3*c);return}catch(f){}var e="";if(d)try{e=escape(Xe(b))}catch(f){return}else e=escape(b);b=this.i;Ad.set(""+a,e,{Aa:c,path:"/",domain:void 0===b?"youtube.com":b,secure:!1})};
ji.prototype.get=function(a,b){var c=void 0,d=!this.h;if(!d)try{c=this.h.get(a)}catch(e){d=!0}if(d&&(c=Ad.get(""+a,void 0))&&(c=unescape(c),b))try{c=JSON.parse(c)}catch(e){this.remove(a),c=void 0}return c};
ji.prototype.remove=function(a){this.h&&this.h.remove(a);var b=this.i;Ad.remove(""+a,"/",void 0===b?"youtube.com":b)};var ki=window,Q=ki.ytcsi&&ki.ytcsi.now?ki.ytcsi.now:ki.performance&&ki.performance.timing&&ki.performance.now&&ki.performance.timing.navigationStart?function(){return ki.performance.timing.navigationStart+ki.performance.now()}:function(){return(new Date).getTime()};var li;function mi(){li||(li=new ji("yt.innertube"));return li}
function ni(a,b,c,d){if(d)return null;d=mi().get("nextId",!0)||1;var e=mi().get("requests",!0)||{};e[d]={method:a,request:b,authState:ii(c),requestTime:Math.round(Q())};mi().set("nextId",d+1,86400,!0);mi().set("requests",e,86400,!0);return d}
function oi(a){var b=mi().get("requests",!0)||{};delete b[a];mi().set("requests",b,86400,!0)}
function pi(a){var b=mi().get("requests",!0);if(b){for(var c in b){var d=b[c];if(!(6E4>Math.round(Q())-d.requestTime)){var e=d.authState,f=ii(hi(!1));pb(e,f)&&(e=d.request,"requestTimeMs"in e&&(e.requestTimeMs=Math.round(Q())),qi(a,d.method,e,{}));delete b[c]}}mi().set("requests",b,86400,!0)}}
;function ri(){}
function si(a,b){return ti(a,0,b)}
ri.prototype.L=function(a,b){return ti(a,1,b)};
function ui(a,b){ti(a,2,b)}
;function vi(){ri.apply(this,arguments)}
u(vi,ri);function wi(){vi.h||(vi.h=new vi);return vi.h}
function ti(a,b,c){void 0!==c&&Number.isNaN(Number(c))&&(c=void 0);var d=B("yt.scheduler.instance.addJob");return d?d(a,b,c):void 0===c?(a(),NaN):oh(a,c||0)}
vi.prototype.Y=function(a){if(void 0===a||!Number.isNaN(Number(a))){var b=B("yt.scheduler.instance.cancelJob");b?b(a):window.clearTimeout(a)}};
vi.prototype.start=function(){var a=B("yt.scheduler.instance.start");a&&a()};var oe=wi();var xi=lc||mc;var yi=function(){var a;return function(){a||(a=new ji("ytidb"));return a}}();
function zi(){var a;return null==(a=yi())?void 0:a.get("LAST_RESULT_ENTRY_KEY",!0)}
;var Ai=[],Bi=!1;function Ci(a){Bi||(Ai.push({type:"ERROR",payload:a}),10<Ai.length&&Ai.shift())}
function Di(a,b){Bi||(Ai.push({type:"EVENT",eventType:a,payload:b}),10<Ai.length&&Ai.shift())}
;function Ei(a){var b=Ha.apply(1,arguments);var c=Error.call(this,a);this.message=c.message;"stack"in c&&(this.stack=c.stack);this.args=[].concat(fa(b))}
u(Ei,Error);function Fi(){try{return Gi(),!0}catch(a){return!1}}
function Gi(){if(void 0!==O("DATASYNC_ID"))return O("DATASYNC_ID");throw new Ei("Datasync ID not set","unknown");}
;function Hi(a){if(0<=a.indexOf(":"))throw Error("Database name cannot contain ':'");}
function Ii(a){return a.substr(0,a.indexOf(":"))||a}
;var Ji={},Ki=(Ji.AUTH_INVALID="No user identifier specified.",Ji.EXPLICIT_ABORT="Transaction was explicitly aborted.",Ji.IDB_NOT_SUPPORTED="IndexedDB is not supported.",Ji.MISSING_INDEX="Index not created.",Ji.MISSING_OBJECT_STORES="Object stores not created.",Ji.DB_DELETED_BY_MISSING_OBJECT_STORES="Database is deleted because expected object stores were not created.",Ji.DB_REOPENED_BY_MISSING_OBJECT_STORES="Database is reopened because expected object stores were not created.",Ji.UNKNOWN_ABORT="Transaction was aborted for unknown reasons.",
Ji.QUOTA_EXCEEDED="The current transaction exceeded its quota limitations.",Ji.QUOTA_MAYBE_EXCEEDED="The current transaction may have failed because of exceeding quota limitations.",Ji.EXECUTE_TRANSACTION_ON_CLOSED_DB="Can't start a transaction on a closed database",Ji.INCOMPATIBLE_DB_VERSION="The binary is incompatible with the database version",Ji),Li={},Mi=(Li.AUTH_INVALID="ERROR",Li.EXECUTE_TRANSACTION_ON_CLOSED_DB="WARNING",Li.EXPLICIT_ABORT="IGNORED",Li.IDB_NOT_SUPPORTED="ERROR",Li.MISSING_INDEX=
"WARNING",Li.MISSING_OBJECT_STORES="ERROR",Li.DB_DELETED_BY_MISSING_OBJECT_STORES="WARNING",Li.DB_REOPENED_BY_MISSING_OBJECT_STORES="WARNING",Li.QUOTA_EXCEEDED="WARNING",Li.QUOTA_MAYBE_EXCEEDED="WARNING",Li.UNKNOWN_ABORT="WARNING",Li.INCOMPATIBLE_DB_VERSION="WARNING",Li),Ni={},Oi=(Ni.AUTH_INVALID=!1,Ni.EXECUTE_TRANSACTION_ON_CLOSED_DB=!1,Ni.EXPLICIT_ABORT=!1,Ni.IDB_NOT_SUPPORTED=!1,Ni.MISSING_INDEX=!1,Ni.MISSING_OBJECT_STORES=!1,Ni.DB_DELETED_BY_MISSING_OBJECT_STORES=!1,Ni.DB_REOPENED_BY_MISSING_OBJECT_STORES=
!1,Ni.QUOTA_EXCEEDED=!1,Ni.QUOTA_MAYBE_EXCEEDED=!0,Ni.UNKNOWN_ABORT=!0,Ni.INCOMPATIBLE_DB_VERSION=!1,Ni);function T(a,b,c,d,e){b=void 0===b?{}:b;c=void 0===c?Ki[a]:c;d=void 0===d?Mi[a]:d;e=void 0===e?Oi[a]:e;Ei.call(this,c,Object.assign({},{name:"YtIdbKnownError",isSw:void 0===self.document,isIframe:self!==self.top,type:a},b));this.type=a;this.message=c;this.level=d;this.h=e;Object.setPrototypeOf(this,T.prototype)}
u(T,Ei);function Pi(a,b){T.call(this,"MISSING_OBJECT_STORES",{expectedObjectStores:b,foundObjectStores:a},Ki.MISSING_OBJECT_STORES);Object.setPrototypeOf(this,Pi.prototype)}
u(Pi,T);function Qi(a,b){var c=Error.call(this);this.message=c.message;"stack"in c&&(this.stack=c.stack);this.index=a;this.objectStore=b;Object.setPrototypeOf(this,Qi.prototype)}
u(Qi,Error);var Ri=["The database connection is closing","Can't start a transaction on a closed database","A mutation operation was attempted on a database that did not allow mutations"];
function Si(a,b,c,d){b=Ii(b);var e=a instanceof Error?a:Error("Unexpected error: "+a);if(e instanceof T)return e;a={objectStoreNames:c,dbName:b,dbVersion:d};if("QuotaExceededError"===e.name)return new T("QUOTA_EXCEEDED",a);if(nc&&"UnknownError"===e.name)return new T("QUOTA_MAYBE_EXCEEDED",a);if(e instanceof Qi)return new T("MISSING_INDEX",Object.assign({},a,{objectStore:e.objectStore,index:e.index}));if("InvalidStateError"===e.name&&Ri.some(function(f){return e.message.includes(f)}))return new T("EXECUTE_TRANSACTION_ON_CLOSED_DB",
a);
if("AbortError"===e.name)return new T("UNKNOWN_ABORT",a,e.message);e.args=[Object.assign({},a,{name:"IdbError",Qb:e.name})];e.level="WARNING";return e}
function Ti(a,b,c){var d=zi();return new T("IDB_NOT_SUPPORTED",{context:{caller:a,publicName:b,version:c,hasSucceededOnce:null==d?void 0:d.hasSucceededOnce}})}
;function Ui(a){if(!a)throw Error();throw a;}
function Vi(a){return a}
function Wi(a){this.h=a}
function W(a){function b(e){if("PENDING"===d.state.status){d.state={status:"REJECTED",reason:e};e=t(d.onRejected);for(var f=e.next();!f.done;f=e.next())f=f.value,f()}}
function c(e){if("PENDING"===d.state.status){d.state={status:"FULFILLED",value:e};e=t(d.h);for(var f=e.next();!f.done;f=e.next())f=f.value,f()}}
var d=this;this.state={status:"PENDING"};this.h=[];this.onRejected=[];a=a.h;try{a(c,b)}catch(e){b(e)}}
W.all=function(a){return new W(new Wi(function(b,c){var d=[],e=a.length;0===e&&b(d);for(var f={Z:0};f.Z<a.length;f={Z:f.Z},++f.Z)Xi(W.resolve(a[f.Z]).then(function(g){return function(h){d[g.Z]=h;e--;0===e&&b(d)}}(f)),function(g){c(g)})}))};
W.resolve=function(a){return new W(new Wi(function(b,c){a instanceof W?a.then(b,c):b(a)}))};
W.reject=function(a){return new W(new Wi(function(b,c){c(a)}))};
W.prototype.then=function(a,b){var c=this,d=null!=a?a:Vi,e=null!=b?b:Ui;return new W(new Wi(function(f,g){"PENDING"===c.state.status?(c.h.push(function(){Yi(c,c,d,f,g)}),c.onRejected.push(function(){Zi(c,c,e,f,g)})):"FULFILLED"===c.state.status?Yi(c,c,d,f,g):"REJECTED"===c.state.status&&Zi(c,c,e,f,g)}))};
function Xi(a,b){a.then(void 0,b)}
function Yi(a,b,c,d,e){try{if("FULFILLED"!==a.state.status)throw Error("calling handleResolve before the promise is fulfilled.");var f=c(a.state.value);f instanceof W?$i(a,b,f,d,e):d(f)}catch(g){e(g)}}
function Zi(a,b,c,d,e){try{if("REJECTED"!==a.state.status)throw Error("calling handleReject before the promise is rejected.");var f=c(a.state.reason);f instanceof W?$i(a,b,f,d,e):d(f)}catch(g){e(g)}}
function $i(a,b,c,d,e){b===c?e(new TypeError("Circular promise chain detected.")):c.then(function(f){f instanceof W?$i(a,b,f,d,e):d(f)},function(f){e(f)})}
;function aj(a,b,c){function d(){c(a.error);f()}
function e(){b(a.result);f()}
function f(){try{a.removeEventListener("success",e),a.removeEventListener("error",d)}catch(g){}}
a.addEventListener("success",e);a.addEventListener("error",d)}
function bj(a){return new Promise(function(b,c){aj(a,b,c)})}
function X(a){return new W(new Wi(function(b,c){aj(a,b,c)}))}
;function cj(a,b){return new W(new Wi(function(c,d){function e(){var f=a?b(a):null;f?f.then(function(g){a=g;e()},d):c()}
e()}))}
;function dj(a,b){this.h=a;this.options=b;this.transactionCount=0;this.j=Math.round(Q());this.i=!1}
m=dj.prototype;m.add=function(a,b,c){return ej(this,[a],{mode:"readwrite",H:!0},function(d){return d.objectStore(a).add(b,c)})};
m.clear=function(a){return ej(this,[a],{mode:"readwrite",H:!0},function(b){return b.objectStore(a).clear()})};
m.close=function(){this.h.close();var a;(null==(a=this.options)?0:a.closed)&&this.options.closed()};
m.count=function(a,b){return ej(this,[a],{mode:"readonly",H:!0},function(c){return c.objectStore(a).count(b)})};
function fj(a,b,c){a=a.h.createObjectStore(b,c);return new gj(a)}
m.delete=function(a,b){return ej(this,[a],{mode:"readwrite",H:!0},function(c){return c.objectStore(a).delete(b)})};
m.get=function(a,b){return ej(this,[a],{mode:"readonly",H:!0},function(c){return c.objectStore(a).get(b)})};
function hj(a,b){return ej(a,["LogsRequestsStore"],{mode:"readwrite",H:!0},function(c){c=c.objectStore("LogsRequestsStore");return X(c.h.put(b,void 0))})}
m.objectStoreNames=function(){return Array.from(this.h.objectStoreNames)};
function ej(a,b,c,d){var e,f,g,h,k,l,n,q,v,p,z,y;return x(function(F){switch(F.h){case 1:var M={mode:"readonly",H:!1,tag:"IDB_TRANSACTION_TAG_UNKNOWN"};"string"===typeof c?M.mode=c:Object.assign(M,c);e=M;a.transactionCount++;f=e.H?3:1;g=0;case 2:if(h){F.o(3);break}g++;k=Math.round(Q());ua(F,4);l=a.h.transaction(b,e.mode);M=new ij(l);M=jj(M,d);return w(F,M,6);case 6:return n=F.i,q=Math.round(Q()),kj(a,k,q,g,void 0,b.join(),e),F.return(n);case 4:v=wa(F);p=Math.round(Q());z=Si(v,a.h.name,b.join(),a.h.version);
if((y=z instanceof T&&!z.h)||g>=f)kj(a,k,p,g,z,b.join(),e),h=z;F.o(2);break;case 3:return F.return(Promise.reject(h))}})}
function kj(a,b,c,d,e,f,g){b=c-b;e?(e instanceof T&&("QUOTA_EXCEEDED"===e.type||"QUOTA_MAYBE_EXCEEDED"===e.type)&&Di("QUOTA_EXCEEDED",{dbName:Ii(a.h.name),objectStoreNames:f,transactionCount:a.transactionCount,transactionMode:g.mode}),e instanceof T&&"UNKNOWN_ABORT"===e.type&&(c-=a.j,0>c&&c>=Math.pow(2,31)&&(c=0),Di("TRANSACTION_UNEXPECTEDLY_ABORTED",{objectStoreNames:f,transactionDuration:b,transactionCount:a.transactionCount,dbDuration:c}),a.i=!0),lj(a,!1,d,f,b,g.tag),Ci(e)):lj(a,!0,d,f,b,g.tag)}
function lj(a,b,c,d,e,f){Di("TRANSACTION_ENDED",{objectStoreNames:d,connectionHasUnknownAbortedTransaction:a.i,duration:e,isSuccessful:b,tryCount:c,tag:void 0===f?"IDB_TRANSACTION_TAG_UNKNOWN":f})}
m.getName=function(){return this.h.name};
function gj(a){this.h=a}
m=gj.prototype;m.add=function(a,b){return X(this.h.add(a,b))};
m.autoIncrement=function(){return this.h.autoIncrement};
m.clear=function(){return X(this.h.clear()).then(function(){})};
m.count=function(a){return X(this.h.count(a))};
function mj(a,b){return nj(a,{query:b},function(c){return c.delete().then(function(){return c.continue()})}).then(function(){})}
m.delete=function(a){return a instanceof IDBKeyRange?mj(this,a):X(this.h.delete(a))};
m.get=function(a){return X(this.h.get(a))};
m.index=function(a){try{return new oj(this.h.index(a))}catch(b){if(b instanceof Error&&"NotFoundError"===b.name)throw new Qi(a,this.h.name);throw b;}};
m.getName=function(){return this.h.name};
m.keyPath=function(){return this.h.keyPath};
function nj(a,b,c){a=a.h.openCursor(b.query,b.direction);return pj(a).then(function(d){return cj(d,c)})}
function ij(a){var b=this;this.h=a;this.j=new Map;this.i=!1;this.done=new Promise(function(c,d){b.h.addEventListener("complete",function(){c()});
b.h.addEventListener("error",function(e){e.currentTarget===e.target&&d(b.h.error)});
b.h.addEventListener("abort",function(){var e=b.h.error;if(e)d(e);else if(!b.i){e=T;for(var f=b.h.objectStoreNames,g=[],h=0;h<f.length;h++){var k=f.item(h);if(null===k)throw Error("Invariant: item in DOMStringList is null");g.push(k)}e=new e("UNKNOWN_ABORT",{objectStoreNames:g.join(),dbName:b.h.db.name,mode:b.h.mode});d(e)}})})}
function jj(a,b){var c=new Promise(function(d,e){try{Xi(b(a).then(function(f){d(f)}),e)}catch(f){e(f),a.abort()}});
return Promise.all([c,a.done]).then(function(d){return t(d).next().value})}
ij.prototype.abort=function(){this.h.abort();this.i=!0;throw new T("EXPLICIT_ABORT");};
ij.prototype.objectStore=function(a){a=this.h.objectStore(a);var b=this.j.get(a);b||(b=new gj(a),this.j.set(a,b));return b};
function oj(a){this.h=a}
m=oj.prototype;m.count=function(a){return X(this.h.count(a))};
m.delete=function(a){return qj(this,{query:a},function(b){return b.delete().then(function(){return b.continue()})})};
m.get=function(a){return X(this.h.get(a))};
m.getKey=function(a){return X(this.h.getKey(a))};
m.keyPath=function(){return this.h.keyPath};
m.unique=function(){return this.h.unique};
function qj(a,b,c){a=a.h.openCursor(void 0===b.query?null:b.query,void 0===b.direction?"next":b.direction);return pj(a).then(function(d){return cj(d,c)})}
function gk(a,b){this.request=a;this.cursor=b}
function pj(a){return X(a).then(function(b){return b?new gk(a,b):null})}
m=gk.prototype;m.advance=function(a){this.cursor.advance(a);return pj(this.request)};
m.continue=function(a){this.cursor.continue(a);return pj(this.request)};
m.delete=function(){return X(this.cursor.delete()).then(function(){})};
m.getKey=function(){return this.cursor.key};
m.W=function(){return this.cursor.value};
m.update=function(a){return X(this.cursor.update(a))};function hk(a,b,c){return new Promise(function(d,e){function f(){v||(v=new dj(g.result,{closed:q}));return v}
var g=void 0!==b?self.indexedDB.open(a,b):self.indexedDB.open(a);var h=c.blocked,k=c.blocking,l=c.sb,n=c.upgrade,q=c.closed,v;g.addEventListener("upgradeneeded",function(p){try{if(null===p.newVersion)throw Error("Invariant: newVersion on IDbVersionChangeEvent is null");if(null===g.transaction)throw Error("Invariant: transaction on IDbOpenDbRequest is null");p.dataLoss&&"none"!==p.dataLoss&&Di("IDB_DATA_CORRUPTED",{reason:p.dataLossMessage||"unknown reason",dbName:Ii(a)});var z=f(),y=new ij(g.transaction);
n&&n(z,function(F){return p.oldVersion<F&&p.newVersion>=F},y);
y.done.catch(function(F){e(F)})}catch(F){e(F)}});
g.addEventListener("success",function(){var p=g.result;k&&p.addEventListener("versionchange",function(){k(f())});
p.addEventListener("close",function(){Di("IDB_UNEXPECTEDLY_CLOSED",{dbName:Ii(a),dbVersion:p.version});l&&l()});
d(f())});
g.addEventListener("error",function(){e(g.error)});
h&&g.addEventListener("blocked",function(){h()})})}
function ik(a,b,c){c=void 0===c?{}:c;return hk(a,b,c)}
function jk(a,b){b=void 0===b?{}:b;var c,d,e,f;return x(function(g){if(1==g.h)return ua(g,2),c=self.indexedDB.deleteDatabase(a),d=b,(e=d.blocked)&&c.addEventListener("blocked",function(){e()}),w(g,bj(c),4);
if(2!=g.h)return va(g,0);f=wa(g);throw Si(f,a,"",-1);})}
;function kk(a){return new Promise(function(b){ui(function(){b()},a)})}
function lk(a,b){this.name=a;this.options=b;this.l=!0;this.v=this.m=0;this.i=500}
lk.prototype.j=function(a,b,c){c=void 0===c?{}:c;return ik(a,b,c)};
lk.prototype.delete=function(a){a=void 0===a?{}:a;return jk(this.name,a)};
function mk(a,b){return new T("INCOMPATIBLE_DB_VERSION",{dbName:a.name,oldVersion:a.options.version,newVersion:b})}
function nk(a,b){if(!b)throw Ti("openWithToken",Ii(a.name));return a.open()}
lk.prototype.open=function(){function a(){var f,g,h,k,l,n,q,v,p,z;return x(function(y){switch(y.h){case 1:return g=null!=(f=Error().stack)?f:"",ua(y,2),w(y,c.j(c.name,c.options.version,e),4);case 4:h=y.i;for(var F=c.options,M=[],K=t(Object.keys(F.ga)),N=K.next();!N.done;N=K.next()){N=N.value;var cb=F.ga[N],hc=void 0===cb.qb?Number.MAX_VALUE:cb.qb;!(h.h.version>=cb.xa)||h.h.version>=hc||h.h.objectStoreNames.contains(N)||M.push(N)}k=M;if(0===k.length){y.o(5);break}l=Object.keys(c.options.ga);n=h.objectStoreNames();
if(c.v<Ah("ytidb_reopen_db_retries",0))return c.v++,h.close(),Ci(new T("DB_REOPENED_BY_MISSING_OBJECT_STORES",{dbName:c.name,expectedObjectStores:l,foundObjectStores:n})),y.return(a());if(!(c.m<Ah("ytidb_remake_db_retries",1))){y.o(6);break}c.m++;if(!P("ytidb_remake_db_enable_backoff_delay")){y.o(7);break}return w(y,kk(c.i),8);case 8:c.i*=2;case 7:return w(y,c.delete(),9);case 9:return Ci(new T("DB_DELETED_BY_MISSING_OBJECT_STORES",{dbName:c.name,expectedObjectStores:l,foundObjectStores:n})),y.return(a());
case 6:throw new Pi(n,l);case 5:return y.return(h);case 2:q=wa(y);if(q instanceof DOMException?"VersionError"!==q.name:"DOMError"in self&&q instanceof DOMError?"VersionError"!==q.name:!(q instanceof Object&&"message"in q)||"An attempt was made to open a database using a lower version than the existing version."!==q.message){y.o(10);break}return w(y,c.j(c.name,void 0,Object.assign({},e,{upgrade:void 0})),11);case 11:v=y.i;p=v.h.version;if(void 0!==c.options.version&&p>c.options.version+1)throw v.close(),
c.l=!1,mk(c,p);return y.return(v);case 10:throw b(),q instanceof Error&&!P("ytidb_async_stack_killswitch")&&(q.stack=q.stack+"\n"+g.substring(g.indexOf("\n")+1)),Si(q,c.name,"",null!=(z=c.options.version)?z:-1);}})}
function b(){c.h===d&&(c.h=void 0)}
var c=this;if(!this.l)throw mk(this);if(this.h)return this.h;var d,e={blocking:function(f){f.close()},
closed:b,sb:b,upgrade:this.options.upgrade};return this.h=d=a()};var ok=new lk("YtIdbMeta",{ga:{databases:{xa:1}},upgrade:function(a,b){b(1)&&fj(a,"databases",{keyPath:"actualName"})}});
function pk(a,b){var c;return x(function(d){if(1==d.h)return w(d,nk(ok,b),2);c=d.i;return d.return(ej(c,["databases"],{H:!0,mode:"readwrite"},function(e){var f=e.objectStore("databases");return f.get(a.actualName).then(function(g){if(g?a.actualName!==g.actualName||a.publicName!==g.publicName||a.userIdentifier!==g.userIdentifier:1)return X(f.h.put(a,void 0)).then(function(){})})}))})}
function qk(a,b){var c;return x(function(d){if(1==d.h)return a?w(d,nk(ok,b),2):d.return();c=d.i;return d.return(c.delete("databases",a))})}
function rk(a,b){var c,d;return x(function(e){return 1==e.h?(c=[],w(e,nk(ok,b),2)):3!=e.h?(d=e.i,w(e,ej(d,["databases"],{H:!0,mode:"readonly"},function(f){c.length=0;return nj(f.objectStore("databases"),{},function(g){a(g.W())&&c.push(g.W());return g.continue()})}),3)):e.return(c)})}
function sk(a){return rk(function(b){return"LogsDatabaseV2"===b.publicName&&void 0!==b.userIdentifier},a)}
;var tk,uk=new function(){}(new function(){});
function vk(){var a,b,c,d;return x(function(e){switch(e.h){case 1:a=zi();if(null==(b=a)?0:b.hasSucceededOnce)return e.return(!0);var f;if(f=xi)f=/WebKit\/([0-9]+)/.exec(Fb()),f=!!(f&&600<=parseInt(f[1],10));f&&(f=/WebKit\/([0-9]+)/.exec(Fb()),f=!(f&&602<=parseInt(f[1],10)));if(f||Zb)return e.return(!1);try{if(c=self,!(c.indexedDB&&c.IDBIndex&&c.IDBKeyRange&&c.IDBObjectStore))return e.return(!1)}catch(g){return e.return(!1)}if(!("IDBTransaction"in self&&"objectStoreNames"in IDBTransaction.prototype))return e.return(!1);
ua(e,2);d={actualName:"yt-idb-test-do-not-use",publicName:"yt-idb-test-do-not-use",userIdentifier:void 0};return w(e,pk(d,uk),4);case 4:return w(e,qk("yt-idb-test-do-not-use",uk),5);case 5:return e.return(!0);case 2:return wa(e),e.return(!1)}})}
function wk(){if(void 0!==tk)return tk;Bi=!0;return tk=vk().then(function(a){Bi=!1;var b;if(null!=(b=yi())&&b.h){var c;b={hasSucceededOnce:(null==(c=zi())?void 0:c.hasSucceededOnce)||a};var d;null==(d=yi())||d.set("LAST_RESULT_ENTRY_KEY",b,2592E3,!0)}return a})}
function xk(){return B("ytglobal.idbToken_")||void 0}
function yk(){var a=xk();return a?Promise.resolve(a):wk().then(function(b){(b=b?uk:void 0)&&C("ytglobal.idbToken_",b);return b})}
;new Ye;function zk(a){if(!Fi())throw a=new T("AUTH_INVALID",{dbName:a}),Ci(a),a;var b=Gi();return{actualName:a+":"+b,publicName:a,userIdentifier:b}}
function Ak(a,b,c,d){var e,f,g,h,k,l;return x(function(n){switch(n.h){case 1:return f=null!=(e=Error().stack)?e:"",w(n,yk(),2);case 2:g=n.i;if(!g)throw h=Ti("openDbImpl",a,b),P("ytidb_async_stack_killswitch")||(h.stack=h.stack+"\n"+f.substring(f.indexOf("\n")+1)),Ci(h),h;Hi(a);k=c?{actualName:a,publicName:a,userIdentifier:void 0}:zk(a);ua(n,3);return w(n,pk(k,g),5);case 5:return w(n,ik(k.actualName,b,d),6);case 6:return n.return(n.i);case 3:return l=wa(n),ua(n,7),w(n,qk(k.actualName,g),9);case 9:va(n,
8);break;case 7:wa(n);case 8:throw l;}})}
function Bk(a,b,c){c=void 0===c?{}:c;return Ak(a,b,!1,c)}
function Ck(a,b,c){c=void 0===c?{}:c;return Ak(a,b,!0,c)}
function Dk(a,b){b=void 0===b?{}:b;var c,d;return x(function(e){if(1==e.h)return w(e,yk(),2);if(3!=e.h){c=e.i;if(!c)return e.return();Hi(a);d=zk(a);return w(e,jk(d.actualName,b),3)}return w(e,qk(d.actualName,c),0)})}
function Ek(a,b,c){a=a.map(function(d){return x(function(e){return 1==e.h?w(e,jk(d.actualName,b),2):w(e,qk(d.actualName,c),0)})});
return Promise.all(a).then(function(){})}
function Fk(){var a=void 0===a?{}:a;var b,c;return x(function(d){if(1==d.h)return w(d,yk(),2);if(3!=d.h){b=d.i;if(!b)return d.return();Hi("LogsDatabaseV2");return w(d,sk(b),3)}c=d.i;return w(d,Ek(c,a,b),0)})}
function Gk(a,b){b=void 0===b?{}:b;var c;return x(function(d){if(1==d.h)return w(d,yk(),2);if(3!=d.h){c=d.i;if(!c)return d.return();Hi(a);return w(d,jk(a,b),3)}return w(d,qk(a,c),0)})}
;function Hk(a){this.h=!1;this.potentialEsfErrorCounter=this.i=0;this.handleError=function(){};
this.ba=function(){};
this.now=Date.now;this.ea=!1;var b;this.Ya=null!=(b=a.Ya)?b:100;var c;this.Xa=null!=(c=a.Xa)?c:1;var d;this.Va=null!=(d=a.Va)?d:2592E6;var e;this.Ua=null!=(e=a.Ua)?e:12E4;var f;this.Wa=null!=(f=a.Wa)?f:5E3;var g;this.s=null!=(g=a.s)?g:void 0;this.pa=!!a.pa;var h;this.oa=null!=(h=a.oa)?h:.1;var k;this.ta=null!=(k=a.ta)?k:10;a.handleError&&(this.handleError=a.handleError);a.ba&&(this.ba=a.ba);a.ea&&(this.ea=a.ea);this.B=a.B;this.J=a.J;this.D=a.D;this.G=a.G;this.T=a.T;this.Da=a.Da;this.Ca=a.Ca;this.s&&
(!this.B||this.B("networkless_logging"))&&Ik(this)}
function Ik(a){a.s&&!a.ea&&(a.h=!0,a.pa&&Math.random()<=a.oa&&a.D.gb(a.s),Jk(a),a.G.F()&&a.ja(),a.G.R(a.Da,a.ja.bind(a)),a.G.R(a.Ca,a.Ha.bind(a)))}
m=Hk.prototype;m.writeThenSend=function(a,b){var c=this;b=void 0===b?{}:b;if(this.s&&this.h){var d={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0};this.D.set(d,this.s).then(function(e){d.id=e;c.G.F()&&Kk(c,d)}).catch(function(e){Kk(c,d);
Lk(c,e)})}else this.T(a,b)};
m.sendThenWrite=function(a,b,c){var d=this;b=void 0===b?{}:b;if(this.s&&this.h){var e={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0};this.B&&this.B("nwl_skip_retry")&&(e.skipRetry=c);if(this.G.F()||this.B&&this.B("nwl_aggressive_send_then_write")&&!e.skipRetry){if(!e.skipRetry){var f=b.onError?b.onError:function(){};
b.onError=function(g,h){return x(function(k){if(1==k.h)return w(k,d.D.set(e,d.s).catch(function(l){Lk(d,l)}),2);
f(g,h);k.h=0})}}this.T(a,b,e.skipRetry)}else this.D.set(e,this.s).catch(function(g){d.T(a,b,e.skipRetry);
Lk(d,g)})}else this.T(a,b,this.B&&this.B("nwl_skip_retry")&&c)};
m.sendAndWrite=function(a,b){var c=this;b=void 0===b?{}:b;if(this.s&&this.h){var d={url:a,options:b,timestamp:this.now(),status:"NEW",sendCount:0},e=!1,f=b.onSuccess?b.onSuccess:function(){};
d.options.onSuccess=function(g,h){void 0!==d.id?c.D.aa(d.id,c.s):e=!0;c.G.S&&c.B&&c.B("vss_network_hint")&&c.G.S(!0);f(g,h)};
this.T(d.url,d.options);this.D.set(d,this.s).then(function(g){d.id=g;e&&c.D.aa(d.id,c.s)}).catch(function(g){Lk(c,g)})}else this.T(a,b)};
m.ja=function(){var a=this;if(!this.s)throw Ti("throttleSend");this.i||(this.i=this.J.L(function(){var b;return x(function(c){if(1==c.h)return w(c,a.D.Ma("NEW",a.s),2);if(3!=c.h)return b=c.i,b?w(c,Kk(a,b),3):(a.Ha(),c.return());a.i&&(a.i=0,a.ja());c.h=0})},this.Ya))};
m.Ha=function(){this.J.Y(this.i);this.i=0};
function Kk(a,b){var c,d;return x(function(e){switch(e.h){case 1:if(!a.s)throw c=Ti("immediateSend"),c;if(void 0===b.id){e.o(2);break}return w(e,a.D.ob(b.id,a.s),3);case 3:(d=e.i)?b=d:a.ba(Error("The request cannot be found in the database."));case 2:if(Mk(a,b,a.Va)){e.o(4);break}a.ba(Error("Networkless Logging: Stored logs request expired age limit"));if(void 0===b.id){e.o(5);break}return w(e,a.D.aa(b.id,a.s),5);case 5:return e.return();case 4:b.skipRetry||(b=Nk(a,b));if(!b){e.o(0);break}if(!b.skipRetry||
void 0===b.id){e.o(8);break}return w(e,a.D.aa(b.id,a.s),8);case 8:a.T(b.url,b.options,!!b.skipRetry),e.h=0}})}
function Nk(a,b){if(!a.s)throw Ti("updateRequestHandlers");var c=b.options.onError?b.options.onError:function(){};
b.options.onError=function(e,f){var g,h,k;return x(function(l){switch(l.h){case 1:g=Ok(f);if(!(a.B&&a.B("nwl_consider_error_code")&&g||a.B&&!a.B("nwl_consider_error_code")&&a.potentialEsfErrorCounter<=a.ta)){l.o(2);break}if(!a.G.U){l.o(3);break}return w(l,a.G.U(),3);case 3:if(a.G.F()){l.o(2);break}c(e,f);if(!a.B||!a.B("nwl_consider_error_code")||void 0===(null==(h=b)?void 0:h.id)){l.o(6);break}return w(l,a.D.Ea(b.id,a.s,!1),6);case 6:return l.return();case 2:if(a.B&&a.B("nwl_consider_error_code")&&
!g&&a.potentialEsfErrorCounter>a.ta)return l.return();a.potentialEsfErrorCounter++;if(void 0===(null==(k=b)?void 0:k.id)){l.o(8);break}return b.sendCount<a.Xa?w(l,a.D.Ea(b.id,a.s),12):w(l,a.D.aa(b.id,a.s),8);case 12:a.J.L(function(){a.G.F()&&a.ja()},a.Wa);
case 8:c(e,f),l.h=0}})};
var d=b.options.onSuccess?b.options.onSuccess:function(){};
b.options.onSuccess=function(e,f){var g;return x(function(h){if(1==h.h)return void 0===(null==(g=b)?void 0:g.id)?h.o(2):w(h,a.D.aa(b.id,a.s),2);a.G.S&&a.B&&a.B("vss_network_hint")&&a.G.S(!0);d(e,f);h.h=0})};
return b}
function Mk(a,b,c){b=b.timestamp;return a.now()-b>=c?!1:!0}
function Jk(a){if(!a.s)throw Ti("retryQueuedRequests");a.D.Ma("QUEUED",a.s).then(function(b){b&&!Mk(a,b,a.Ua)?a.J.L(function(){return x(function(c){if(1==c.h)return void 0===b.id?c.o(2):w(c,a.D.Ea(b.id,a.s),2);Jk(a);c.h=0})}):a.G.F()&&a.ja()})}
function Lk(a,b){a.Za&&!a.G.F()?a.Za(b):a.handleError(b)}
function Ok(a){var b;return(a=null==a?void 0:null==(b=a.error)?void 0:b.code)&&400<=a&&599>=a?!1:!0}
;var Pk=B("ytPubsub2Pubsub2Instance")||new L;L.prototype.subscribe=L.prototype.subscribe;L.prototype.unsubscribeByKey=L.prototype.ka;L.prototype.publish=L.prototype.ca;L.prototype.clear=L.prototype.clear;C("ytPubsub2Pubsub2Instance",Pk);C("ytPubsub2Pubsub2SubscribedKeys",B("ytPubsub2Pubsub2SubscribedKeys")||{});C("ytPubsub2Pubsub2TopicToKeys",B("ytPubsub2Pubsub2TopicToKeys")||{});C("ytPubsub2Pubsub2IsAsync",B("ytPubsub2Pubsub2IsAsync")||{});C("ytPubsub2Pubsub2SkipSubKey",null);function Qk(a,b){lk.call(this,a,b);this.options=b;Hi(a)}
u(Qk,lk);function Rk(a,b){var c;return function(){c||(c=new Qk(a,b));return c}}
Qk.prototype.j=function(a,b,c){c=void 0===c?{}:c;return(this.options.Fa?Ck:Bk)(a,b,Object.assign({},c))};
Qk.prototype.delete=function(a){a=void 0===a?{}:a;return(this.options.Fa?Gk:Dk)(this.name,a)};
function Sk(a,b){return Rk(a,b)}
;var Tk;
function Uk(){if(Tk)return Tk();var a={};Tk=Sk("LogsDatabaseV2",{ga:(a.LogsRequestsStore={xa:2},a),Fa:!1,upgrade:function(b,c,d){c(2)&&fj(b,"LogsRequestsStore",{keyPath:"id",autoIncrement:!0});c(3);c(5)&&(d=d.objectStore("LogsRequestsStore"),d.h.indexNames.contains("newRequest")&&d.h.deleteIndex("newRequest"),d.h.createIndex("newRequestV2",["status","interface","timestamp"],{unique:!1}));c(7)&&b.h.objectStoreNames.contains("sapisid")&&b.h.deleteObjectStore("sapisid");c(9)&&b.h.objectStoreNames.contains("SWHealthLog")&&b.h.deleteObjectStore("SWHealthLog")},
version:9});return Tk()}
;function Vk(a){return nk(Uk(),a)}
function Wk(a,b){var c,d,e,f;return x(function(g){if(1==g.h)return c={startTime:Q(),transactionType:"YT_IDB_TRANSACTION_TYPE_WRITE"},w(g,Vk(b),2);if(3!=g.h)return d=g.i,e=Object.assign({},a,{options:JSON.parse(JSON.stringify(a.options)),interface:O("INNERTUBE_CONTEXT_CLIENT_NAME",0)}),w(g,hj(d,e),3);f=g.i;c.tb=Q();Xk(c);return g.return(f)})}
function Yk(a,b){var c,d,e,f,g,h,k;return x(function(l){if(1==l.h)return c={startTime:Q(),transactionType:"YT_IDB_TRANSACTION_TYPE_READ"},w(l,Vk(b),2);if(3!=l.h)return d=l.i,e=O("INNERTUBE_CONTEXT_CLIENT_NAME",0),f=[a,e,0],g=[a,e,Q()],h=IDBKeyRange.bound(f,g),k=void 0,w(l,ej(d,["LogsRequestsStore"],{mode:"readwrite",H:!0},function(n){return qj(n.objectStore("LogsRequestsStore").index("newRequestV2"),{query:h,direction:"prev"},function(q){q.W()&&(k=q.W(),"NEW"===a&&(k.status="QUEUED",q.update(k)))})}),
3);
c.tb=Q();Xk(c);return l.return(k)})}
function Zk(a,b){var c;return x(function(d){if(1==d.h)return w(d,Vk(b),2);c=d.i;return d.return(ej(c,["LogsRequestsStore"],{mode:"readwrite",H:!0},function(e){var f=e.objectStore("LogsRequestsStore");return f.get(a).then(function(g){if(g)return g.status="QUEUED",X(f.h.put(g,void 0)).then(function(){return g})})}))})}
function $k(a,b,c){c=void 0===c?!0:c;var d;return x(function(e){if(1==e.h)return w(e,Vk(b),2);d=e.i;return e.return(ej(d,["LogsRequestsStore"],{mode:"readwrite",H:!0},function(f){var g=f.objectStore("LogsRequestsStore");return g.get(a).then(function(h){return h?(h.status="NEW",c&&(h.sendCount+=1),X(g.h.put(h,void 0)).then(function(){return h})):W.resolve(void 0)})}))})}
function al(a,b){var c;return x(function(d){if(1==d.h)return w(d,Vk(b),2);c=d.i;return d.return(c.delete("LogsRequestsStore",a))})}
function bl(a){var b,c;return x(function(d){if(1==d.h)return w(d,Vk(a),2);b=d.i;c=Q()-2592E6;return w(d,ej(b,["LogsRequestsStore"],{mode:"readwrite",H:!0},function(e){return nj(e.objectStore("LogsRequestsStore"),{},function(f){if(f.W().timestamp<=c)return f.delete().then(function(){return f.continue()})})}),0)})}
function cl(){x(function(a){return w(a,Fk(),0)})}
function Xk(a){if(!P("nwl_csi_killswitch")&&.01>=Math.random()){var b=B("ytPubsub2Pubsub2Instance");b&&b.publish.call(b,"nwl_transaction_latency_payload".toString(),"nwl_transaction_latency_payload",a)}}
;var dl={},el=Sk("ServiceWorkerLogsDatabase",{ga:(dl.SWHealthLog={xa:1},dl),Fa:!0,upgrade:function(a,b){b(1)&&fj(a,"SWHealthLog",{keyPath:"id",autoIncrement:!0}).h.createIndex("swHealthNewRequest",["interface","timestamp"],{unique:!1})},
version:1});function fl(a){return nk(el(),a)}
function gl(a){var b,c;x(function(d){if(1==d.h)return w(d,fl(a),2);b=d.i;c=Q()-2592E6;return w(d,ej(b,["SWHealthLog"],{mode:"readwrite",H:!0},function(e){return nj(e.objectStore("SWHealthLog"),{},function(f){if(f.W().timestamp<=c)return f.delete().then(function(){return f.continue()})})}),0)})}
function hl(a){var b;return x(function(c){if(1==c.h)return w(c,fl(a),2);b=c.i;return w(c,b.clear("SWHealthLog"),0)})}
;var il={},jl=0;function kl(a){var b=void 0===b?"":b;if(a)if(b)Oh(a,void 0,"POST",b);else if(O("USE_NET_AJAX_FOR_PING_TRANSPORT",!1))Oh(a,void 0,"GET","");else{b:{try{var c=new Xa({url:a});if(c.j&&c.i||c.l){var d=Kb(a.match(Jb)[5]||null);var e=!(!d||!d.endsWith("/aclk")||"1"!==Ub(a,"ri"));break b}}catch(g){}e=!1}if(e){b:{try{if(window.navigator&&window.navigator.sendBeacon&&window.navigator.sendBeacon(a,"")){var f=!0;break b}}catch(g){}f=!1}b=f?!0:!1}else b=!1;b||ll(a)}}
function ll(a){var b=new Image,c=""+jl++;il[c]=b;b.onload=b.onerror=function(){delete il[c]};
b.src=a}
;function ml(){this.h=new Map;this.i=!1}
function nl(){if(!ml.h){var a=B("yt.networkRequestMonitor.instance")||new ml;C("yt.networkRequestMonitor.instance",a);ml.h=a}return ml.h}
ml.prototype.requestComplete=function(a,b){b&&(this.i=!0);a=this.removeParams(a);this.h.get(a)||this.h.set(a,b)};
ml.prototype.isEndpointCFR=function(a){a=this.removeParams(a);return(a=this.h.get(a))?!1:!1===a&&this.i?!0:null};
ml.prototype.removeParams=function(a){return a.split("?")[0]};
ml.prototype.removeParams=ml.prototype.removeParams;ml.prototype.isEndpointCFR=ml.prototype.isEndpointCFR;ml.prototype.requestComplete=ml.prototype.requestComplete;ml.getInstance=nl;var ol;function pl(){ol||(ol=new ji("yt.offline"));return ol}
function ql(a){if(P("offline_error_handling")){var b=pl().get("errors",!0)||{};b[a.message]={name:a.name,stack:a.stack};a.level&&(b[a.message].level=a.level);pl().set("errors",b,2592E3,!0)}}
function rl(){if(P("offline_error_handling")){var a=pl().get("errors",!0);if(a){for(var b in a)if(a[b]){var c=new Ei(b,"sent via offline_errors");c.name=a[b].name;c.stack=a[b].stack;c.level=a[b].level;eh(c)}pl().set("errors",{},2592E3,!0)}}}
;var sl=Ah("network_polling_interval",3E4);function Y(){J.call(this);var a=this;this.la=0;this.A=this.m=!1;this.i=this.ya();P("use_shared_nsm")?(this.h=ne(),P("use_shared_nsm_and_keep_yt_online_updated")&&(this.h.R("networkstatus-online",function(){a.i=!0;a.A&&rl()}),this.h.R("networkstatus-offline",function(){a.i=!1}))):(tl(this),ul(this))}
u(Y,J);function vl(){if(!Y.h){var a=B("yt.networkStatusManager.instance")||new Y;C("yt.networkStatusManager.instance",a);Y.h=a}return Y.h}
m=Y.prototype;m.F=function(){if(P("use_shared_nsm")&&this.h){var a;return null==(a=this.h)?void 0:a.F()}return this.i};
m.S=function(a){if(P("use_shared_nsm")&&this.h){var b;null!=(b=this.h)&&(b.h=a)}else a!==this.i&&(this.i=a)};
m.pb=function(a){!P("use_shared_nsm")&&(this.m=!0,void 0===a?0:a)&&(this.la||wl(this))};
m.ya=function(){var a=window.navigator.onLine;return void 0===a?!0:a};
m.ib=function(){this.A=!0};
m.R=function(a,b){return P("use_shared_nsm")&&this.h?this.h.R(a,b):J.prototype.R.call(this,a,b)};
function ul(a){window.addEventListener("online",function(){return x(function(b){if(1==b.h)return w(b,a.U(),2);a.A&&rl();b.h=0})})}
function tl(a){window.addEventListener("offline",function(){return x(function(b){return w(b,a.U(),0)})})}
function wl(a){a.la=si(function(){return x(function(b){if(1==b.h)return a.i?a.ya()||!a.m?b.o(3):w(b,a.U(),3):w(b,a.U(),3);wl(a);b.h=0})},sl)}
m.U=function(a){var b=this;if(P("use_shared_nsm")&&this.h){var c=le(this.h,a);c.then(function(d){P("use_cfr_monitor")&&nl().requestComplete("generate_204",d)});
return c}return this.u?this.u:this.u=new Promise(function(d){var e,f,g,h;return x(function(k){switch(k.h){case 1:return e=window.AbortController?new window.AbortController:void 0,g=null==(f=e)?void 0:f.signal,h=!1,ua(k,2,3),e&&(b.O=oe.L(function(){e.abort()},a||2E4)),w(k,fetch("/generate_204",{method:"HEAD",
signal:g}),5);case 5:h=!0;case 3:xa(k);P("use_cfr_monitor")&&nl().requestComplete("generate_204",h);b.u=void 0;b.O&&oe.Y(b.O);h!==b.i&&(b.i=h,b.i&&b.m?ie(b,"ytnetworkstatus-online"):b.m&&ie(b,"ytnetworkstatus-offline"));d(h);ya(k);break;case 2:wa(k),h=!1,k.o(3)}})})};
Y.prototype.sendNetworkCheckRequest=Y.prototype.U;Y.prototype.listen=Y.prototype.R;Y.prototype.enableErrorFlushing=Y.prototype.ib;Y.prototype.getWindowStatus=Y.prototype.ya;Y.prototype.monitorNetworkStatusChange=Y.prototype.pb;Y.prototype.networkStatusHint=Y.prototype.S;Y.prototype.isNetworkAvailable=Y.prototype.F;Y.getInstance=vl;function xl(a){a=void 0===a?{}:a;J.call(this);var b=this;this.i=this.O=0;this.m="ytnetworkstatus-offline";this.u="ytnetworkstatus-online";P("use_shared_nsm")&&(this.m="networkstatus-offline",this.u="networkstatus-online");this.h=vl();var c=B("yt.networkStatusManager.instance.monitorNetworkStatusChange").bind(this.h);c&&c(a.Ka);a.Ra&&(c=B("yt.networkStatusManager.instance.enableErrorFlushing").bind(this.h))&&c();if(c=B("yt.networkStatusManager.instance.listen").bind(this.h))a.va?(this.va=a.va,c(this.u,
function(){yl(b,"publicytnetworkstatus-online")}),c(this.m,function(){yl(b,"publicytnetworkstatus-offline")})):(c(this.u,function(){ie(b,"publicytnetworkstatus-online")}),c(this.m,function(){ie(b,"publicytnetworkstatus-offline")}))}
u(xl,J);xl.prototype.F=function(){var a=B("yt.networkStatusManager.instance.isNetworkAvailable");return a?a.bind(this.h)():!0};
xl.prototype.S=function(a){var b=B("yt.networkStatusManager.instance.networkStatusHint").bind(this.h);b&&b(a)};
xl.prototype.U=function(a){var b=this,c;return x(function(d){c=B("yt.networkStatusManager.instance.sendNetworkCheckRequest").bind(b.h);return P("skip_network_check_if_cfr")&&nl().isEndpointCFR("generate_204")?d.return(new Promise(function(e){var f;b.S((null==(f=window.navigator)?void 0:f.onLine)||!0);e(b.F())})):c?d.return(c(a)):d.return(!0)})};
function yl(a,b){a.va?a.i?(oe.Y(a.O),a.O=oe.L(function(){a.A!==b&&(ie(a,b),a.A=b,a.i=Q())},a.va-(Q()-a.i))):(ie(a,b),a.A=b,a.i=Q()):ie(a,b)}
;var zl;function Al(){Hk.call(this,{D:{gb:bl,aa:al,Ma:Yk,ob:Zk,Ea:$k,set:Wk},G:Bl(),handleError:eh,ba:fh,T:Cl,now:Q,Za:ql,J:wi(),Da:"publicytnetworkstatus-online",Ca:"publicytnetworkstatus-offline",pa:!0,oa:.1,ta:Ah("potential_esf_error_limit",10),B:P,ea:!(Fi()&&(P("embeds_web_nwl_disable_nocookie")?"www.youtube-nocookie.com"!==Lb(document.location.toString()):1))});this.j=new Ye;P("networkless_immediately_drop_all_requests")&&cl();Gk("LogsDatabaseV2")}
u(Al,Hk);function Dl(){var a=B("yt.networklessRequestController.instance");a||(a=new Al,C("yt.networklessRequestController.instance",a),P("networkless_logging")&&yk().then(function(b){a.s=b;Ik(a);a.j.resolve();a.pa&&Math.random()<=a.oa&&a.s&&gl(a.s);P("networkless_immediately_drop_sw_health_store")&&El(a)}));
return a}
Al.prototype.writeThenSend=function(a,b){b||(b={});Fi()||(this.h=!1);Hk.prototype.writeThenSend.call(this,a,b)};
Al.prototype.sendThenWrite=function(a,b,c){b||(b={});Fi()||(this.h=!1);Hk.prototype.sendThenWrite.call(this,a,b,c)};
Al.prototype.sendAndWrite=function(a,b){b||(b={});Fi()||(this.h=!1);Hk.prototype.sendAndWrite.call(this,a,b)};
Al.prototype.awaitInitialization=function(){return this.j.promise};
function El(a){var b;x(function(c){if(!a.s)throw b=Ti("clearSWHealthLogsDb"),b;return c.return(hl(a.s).catch(function(d){a.handleError(d)}))})}
function Cl(a,b,c){P("use_cfr_monitor")&&Fl(a,b);var d;if(null==(d=b.postParams)?0:d.requestTimeMs)b.postParams.requestTimeMs=Math.round(Q());c&&0===Object.keys(b).length?kl(a):Lh(a,b)}
function Bl(){zl||(zl=new xl({Ra:!0,Ka:!0}));return zl}
function Fl(a,b){var c=b.onError?b.onError:function(){};
b.onError=function(e,f){nl().requestComplete(a,!1);c(e,f)};
var d=b.onSuccess?b.onSuccess:function(){};
b.onSuccess=function(e,f){nl().requestComplete(a,!0);d(e,f)}}
;var Gl=0,Hl=0,Il,Jl=A.ytNetworklessLoggingInitializationOptions||{isNwlInitialized:!1,potentialEsfErrorCounter:Hl};C("ytNetworklessLoggingInitializationOptions",Jl);function Kl(a,b){function c(d){var e=Ll().F();if(!Ml()||!d||e&&P("vss_networkless_bypass_write"))Nl(a,b);else{var f={url:a,options:b,timestamp:Q(),status:"NEW",sendCount:0};Wk(f,d).then(function(g){f.id=g;Ll().F()&&Ol(f)}).catch(function(g){Ol(f);
Ll().F()?eh(g):ql(g)})}}
b=void 0===b?{}:b;P("skip_is_supported_killswitch")?yk().then(function(d){c(d)}):c(xk())}
function Pl(a,b){function c(d){if(Ml()&&d){var e={url:a,options:b,timestamp:Q(),status:"NEW",sendCount:0},f=!1,g=b.onSuccess?b.onSuccess:function(){};
e.options.onSuccess=function(k,l){P("use_cfr_monitor")&&nl().requestComplete(e.url,!0);void 0!==e.id?al(e.id,d):f=!0;P("vss_network_hint")&&Ll().S(!0);g(k,l)};
if(P("use_cfr_monitor")){var h=b.onError?b.onError:function(){};
e.options.onError=function(k,l){nl().requestComplete(e.url,!1);h(k,l)}}Nl(e.url,e.options);
Wk(e,d).then(function(k){e.id=k;f&&al(e.id,d)}).catch(function(k){Ll().F()?eh(k):ql(k)})}else Nl(a,b)}
b=void 0===b?{}:b;P("skip_is_supported_killswitch")?yk().then(function(d){c(d)}):c(xk())}
function Ql(){var a=xk();if(!a)throw Ti("throttleSend");Gl||(Gl=oe.L(function(){var b;return x(function(c){if(1==c.h)return w(c,Yk("NEW",a),2);if(3!=c.h)return b=c.i,b?w(c,Ol(b),3):(oe.Y(Gl),Gl=0,c.return());Gl&&(Gl=0,Ql());c.h=0})},100))}
function Ol(a){var b,c,d;return x(function(e){switch(e.h){case 1:b=xk();if(!b)throw c=Ti("immediateSend"),c;if(void 0===a.id){e.o(2);break}return w(e,Zk(a.id,b),3);case 3:(d=e.i)?a=d:fh(Error("The request cannot be found in the database."));case 2:var f=a.timestamp;if(!(2592E6<=Q()-f)){e.o(4);break}fh(Error("Networkless Logging: Stored logs request expired age limit"));if(void 0===a.id){e.o(5);break}return w(e,al(a.id,b),5);case 5:return e.return();case 4:a.skipRetry||(a=Rl(a));f=a;var g,h;if(null==
f?0:null==(g=f.options)?0:null==(h=g.postParams)?0:h.requestTimeMs)f.options.postParams.requestTimeMs=Math.round(Q());a=f;if(!a){e.o(0);break}if(!a.skipRetry||void 0===a.id){e.o(8);break}return w(e,al(a.id,b),8);case 8:Nl(a.url,a.options,!!a.skipRetry),e.h=0}})}
function Rl(a){var b=xk();if(!b)throw Ti("updateRequestHandlers");var c=a.options.onError?a.options.onError:function(){};
a.options.onError=function(e,f){var g,h,k;return x(function(l){switch(l.h){case 1:P("use_cfr_monitor")&&nl().requestComplete(a.url,!1);g=Ok(f);if(!(P("nwl_consider_error_code")&&g||!P("nwl_consider_error_code")&&Sl()<=Ah("potential_esf_error_limit",10))){l.o(2);break}if(P("skip_checking_network_on_cfr_failure")&&(!P("skip_checking_network_on_cfr_failure")||nl().isEndpointCFR(a.url))){l.o(3);break}return w(l,Ll().U(),3);case 3:if(Ll().F()){l.o(2);break}c(e,f);if(!P("nwl_consider_error_code")||void 0===
(null==(h=a)?void 0:h.id)){l.o(6);break}return w(l,$k(a.id,b,!1),6);case 6:return l.return();case 2:if(P("nwl_consider_error_code")&&!g&&Sl()>Ah("potential_esf_error_limit",10))return l.return();B("ytNetworklessLoggingInitializationOptions")&&Jl.potentialEsfErrorCounter++;Hl++;if(void 0===(null==(k=a)?void 0:k.id)){l.o(8);break}return 1>a.sendCount?w(l,$k(a.id,b),12):w(l,al(a.id,b),8);case 12:oe.L(function(){Ll().F()&&Ql()},5E3);
case 8:c(e,f),l.h=0}})};
var d=a.options.onSuccess?a.options.onSuccess:function(){};
a.options.onSuccess=function(e,f){var g;return x(function(h){if(1==h.h)return P("use_cfr_monitor")&&nl().requestComplete(a.url,!0),void 0===(null==(g=a)?void 0:g.id)?h.o(2):w(h,al(a.id,b),2);P("vss_network_hint")&&Ll().S(!0);d(e,f);h.h=0})};
return a}
function Ll(){if(P("use_new_nwl"))return Bl();Il||(Il=new xl({Ra:!0,Ka:!0}));return Il}
function Nl(a,b,c){c&&0===Object.keys(b).length?kl(a):Lh(a,b)}
function Ml(){return B("ytNetworklessLoggingInitializationOptions")?Jl.isNwlInitialized:!1}
function Sl(){return B("ytNetworklessLoggingInitializationOptions")?Jl.potentialEsfErrorCounter:Hl}
;function Tl(a){var b=this;this.config_=null;a?this.config_=a:$h()&&(this.config_=ai());si(function(){pi(b)},5E3)}
Tl.prototype.isReady=function(){!this.config_&&$h()&&(this.config_=ai());return!!this.config_};
function qi(a,b,c,d){function e(z){z=void 0===z?!1:z;var y;if(d.retry&&"www.youtube-nocookie.com"!=h&&(z||P("skip_ls_gel_retry")||"application/json"!==g.headers["Content-Type"]||(y=ni(b,c,l,k)),y)){var F=g.onSuccess,M=g.onFetchSuccess;g.onSuccess=function(K,N){oi(y);F(K,N)};
c.onFetchSuccess=function(K,N){oi(y);M(K,N)}}try{z&&d.retry&&!d.Sa.bypassNetworkless?(g.method="POST",d.Sa.writeThenSend?P("use_new_nwl_wts")?Dl().writeThenSend(p,g):Kl(p,g):P("use_new_nwl_saw")?Dl().sendAndWrite(p,g):Pl(p,g)):(g.method="POST",g.postParams||(g.postParams={}),Lh(p,g))}catch(K){if("InvalidAccessError"==K.name)y&&(oi(y),y=0),fh(Error("An extension is blocking network request."));
else throw K;}y&&si(function(){pi(a)},5E3)}
!O("VISITOR_DATA")&&"visitor_id"!==b&&.01>Math.random()&&fh(new Ei("Missing VISITOR_DATA when sending innertube request.",b,c,d));if(!a.isReady()){var f=new Ei("innertube xhrclient not ready",b,c,d);eh(f);throw f;}var g={headers:d.headers||{},method:"POST",postParams:c,postBody:d.postBody,postBodyFormat:d.postBodyFormat||"JSON",onTimeout:function(){d.onTimeout()},
onFetchTimeout:d.onTimeout,onSuccess:function(z,y){if(d.onSuccess)d.onSuccess(y)},
onFetchSuccess:function(z){if(d.onSuccess)d.onSuccess(z)},
onError:function(z,y){if(d.onError)d.onError(y)},
onFetchError:function(z){if(d.onError)d.onError(z)},
timeout:d.timeout,withCredentials:!0};g.headers["Content-Type"]||(g.headers["Content-Type"]="application/json");var h="";(f=a.config_.lb)&&(h=f);var k=a.config_.nb||!1,l=hi(k,h,d);Object.assign(g.headers,l);(f=g.headers.Authorization)&&!h&&(g.headers["x-origin"]=window.location.origin);var n="/youtubei/"+a.config_.innertubeApiVersion+"/"+b,q={alt:"json"},v=a.config_.mb&&f;v=v&&f.startsWith("Bearer");v||(q.key=a.config_.innertubeApiKey);var p=xh(""+h+n,q||{},!0);P("use_new_nwl")&&Dl().h||!P("use_new_nwl")&&
Ml()?wk().then(function(z){e(z)}):e(!1)}
;var Ul={appSettingsCaptured:!0,visualElementAttached:!0,visualElementGestured:!0,visualElementHidden:!0,visualElementShown:!0,flowEvent:!0,visualElementStateChanged:!0,playbackAssociated:!0,youThere:!0,accountStateChangeSignedIn:!0,accountStateChangeSignedOut:!0},Vl={latencyActionBaselined:!0,latencyActionInfo:!0,latencyActionTicked:!0,bedrockRepetitiveActionTimed:!0,adsClientStateChange:!0,streamzIncremented:!0,mdxDialAdditionalDataUpdateEvent:!0,tvhtml5WatchKeyEvent:!0,tvhtml5VideoSeek:!0,tokenRefreshEvent:!0,
adNotify:!0,adNotifyFilled:!0,tvhtml5LaunchUrlComponentChanged:!0,bedrockResourceConsumptionSnapshot:!0,deviceStartupMetrics:!0,mdxSignIn:!0,tvhtml5KeyboardLogging:!0,tvhtml5StartupSoundEvent:!0,tvhtml5LiveChatStatus:!0,tvhtml5DeviceStorageStatus:!0,tvhtml5LocalStorage:!0,directSignInEvent:!0,finalPayload:!0,tvhtml5SearchCompleted:!0,tvhtml5KeyboardPerformance:!0,adNotifyFailure:!0,latencyActionSpan:!0,tvhtml5AccountDialogOpened:!0,tvhtml5ApiTest:!0};function Wl(){var a=B("_lact",window);return null==a?-1:Math.max(Date.now()-a,0)}
;var Xl=A.ytPubsubPubsubInstance||new L,Yl=A.ytPubsubPubsubSubscribedKeys||{},Zl=A.ytPubsubPubsubTopicToKeys||{},$l=A.ytPubsubPubsubIsSynchronous||{};L.prototype.subscribe=L.prototype.subscribe;L.prototype.unsubscribeByKey=L.prototype.ka;L.prototype.publish=L.prototype.ca;L.prototype.clear=L.prototype.clear;C("ytPubsubPubsubInstance",Xl);C("ytPubsubPubsubTopicToKeys",Zl);C("ytPubsubPubsubIsSynchronous",$l);C("ytPubsubPubsubSubscribedKeys",Yl);var am=Ah("initial_gel_batch_timeout",2E3),bm=Math.pow(2,16)-1,cm=void 0;function dm(){this.j=this.h=this.i=0}
var em=new dm,fm=new dm,gm=!0,hm=A.ytLoggingTransportGELQueue_||new Map;C("ytLoggingTransportGELQueue_",hm);var im=A.ytLoggingTransportGELProtoQueue_||new Map;C("ytLoggingTransportGELProtoQueue_",im);var jm=A.ytLoggingTransportTokensToCttTargetIds_||{};C("ytLoggingTransportTokensToCttTargetIds_",jm);var km=A.ytLoggingTransportTokensToJspbCttTargetIds_||{};C("ytLoggingTransportTokensToJspbCttTargetIds_",km);
function lm(a,b){if("log_event"===a.endpoint){var c=mm(a),d=hm.get(c)||[];hm.set(c,d);d.push(a.payload);nm(b,d,c)}}
function om(a,b){if("log_event"===a.endpoint){var c=mm(a,!0),d=im.get(c)||[];im.set(c,d);a=Yc(a.payload);d.push(a);nm(b,d,c,!0)}}
function nm(a,b,c,d){d=void 0===d?!1:d;a&&(cm=new a);a=Ah("tvhtml5_logging_max_batch")||Ah("web_logging_max_batch")||100;var e=Q(),f=d?fm.j:em.j;b.length>=a?pm({writeThenSend:!0},P("flush_only_full_queue")?c:void 0,d):10<=e-f&&(qm(d),d?fm.j=e:em.j=e)}
function rm(a,b){if("log_event"===a.endpoint){var c=mm(a),d=new Map;d.set(c,[a.payload]);b&&(cm=new b);return new Ze(function(e){cm&&cm.isReady()?sm(d,e,{bypassNetworkless:!0},!0):e()})}}
function tm(a,b){if("log_event"===a.endpoint){var c=mm(a,!0),d=new Map;d.set(c,[Yc(a.payload)]);b&&(cm=new b);return new Ze(function(e){cm&&cm.isReady()?um(d,e,{bypassNetworkless:!0},!0):e()})}}
function mm(a,b){var c="";if(a.da)c="visitorOnlyApprovedKey";else if(a.P){if(void 0===b?0:b){b=a.P.token;c=a.P;var d=new Hg;c.videoId?d.setVideoId(c.videoId):c.playlistId&&Pc(d,2,Ig,c.playlistId);km[b]=d}else b=a.P,c={},b.videoId?c.videoId=b.videoId:b.playlistId&&(c.playlistId=b.playlistId),jm[a.P.token]=c;c=a.P.token}return c}
function pm(a,b,c){a=void 0===a?{}:a;c=void 0===c?!1:c;new Ze(function(d){c?(window.clearTimeout(fm.i),window.clearTimeout(fm.h),fm.h=0):(window.clearTimeout(em.i),window.clearTimeout(em.h),em.h=0);if(cm&&cm.isReady())if(void 0!==b)if(c){var e=new Map,f=im.get(b)||[];e.set(b,f);um(e,d,a);im.delete(b)}else e=new Map,f=hm.get(b)||[],e.set(b,f),sm(e,d,a),hm.delete(b);else c?(um(im,d,a),im.clear()):(sm(hm,d,a),hm.clear());else qm(c),d()})}
function qm(a){a=void 0===a?!1:a;if(P("web_gel_timeout_cap")&&(!a&&!em.h||a&&!fm.h)){var b=oh(function(){pm({writeThenSend:!0},void 0,a)},6E4);
a?fm.h=b:em.h=b}window.clearTimeout(a?fm.i:em.i);b=O("LOGGING_BATCH_TIMEOUT",Ah("web_gel_debounce_ms",1E4));P("shorten_initial_gel_batch_timeout")&&gm&&(b=am);b=oh(function(){pm({writeThenSend:!0},void 0,a)},b);
a?fm.i=b:em.i=b}
function sm(a,b,c,d){var e=cm;c=void 0===c?{}:c;var f=Math.round(Q()),g=a.size;a=t(a);for(var h=a.next();!h.done;h=a.next()){var k=t(h.value);h=k.next().value;var l=k=k.next().value;k=qb({context:bi(e.config_||ai())});k.events=l;(l=jm[h])&&vm(k,h,l);delete jm[h];h="visitorOnlyApprovedKey"===h;wm(k,f,h);xm(c);qi(e,"log_event",k,ym(c,h,function(){g--;g||b()},function(){g--;
g||b()},d));
gm=!1}}
function um(a,b,c,d){var e=cm;c=void 0===c?{}:c;var f=Math.round(Q()),g=a.size;a=t(a);for(var h=a.next();!h.done;h=a.next()){var k=t(h.value);h=k.next().value;var l=k=k.next().value;k=new Jg;var n=gi(e.config_||ai());H(k,1,n);l=zm(l);for(n=0;n<l.length;n++)Uc(k,3,Eg,l[n]);(l=km[h])&&Am(k,h,l);delete km[h];h="visitorOnlyApprovedKey"===h;Bm(k,f,h);xm(c);k=Yc(k);h=ym(c,h,function(){g--;g||b()},function(){g--;
g||b()},d);
h.headers={"Content-Type":"application/json+protobuf"};h.postBodyFormat="JSPB";h.postBody=k;qi(e,"log_event","",h);gm=!1}}
function xm(a){P("always_send_and_write")&&(a.writeThenSend=!1)}
function ym(a,b,c,d,e){return{retry:!0,onSuccess:c,onError:d,Sa:a,da:b,Nb:!!e,headers:{},postBodyFormat:"",postBody:""}}
function wm(a,b,c){a.requestTimeMs=String(b);P("unsplit_gel_payloads_in_logs")&&(a.unsplitGelPayloadsInLogs=!0);!c&&(b=O("EVENT_ID"))&&(c=Cm(),a.serializedClientEventId={serializedEventId:b,clientCounter:String(c)})}
function Bm(a,b,c){G(a,2,b);if(!c&&(b=O("EVENT_ID"))){c=Cm();var d=new Gg;G(d,1,b);G(d,2,c);H(a,5,d)}}
function Cm(){var a=O("BATCH_CLIENT_COUNTER")||0;a||(a=Math.floor(Math.random()*bm/2));a++;a>bm&&(a=1);Zg("BATCH_CLIENT_COUNTER",a);return a}
function vm(a,b,c){if(c.videoId)var d="VIDEO";else if(c.playlistId)d="PLAYLIST";else return;a.credentialTransferTokenTargetId=c;a.context=a.context||{};a.context.user=a.context.user||{};a.context.user.credentialTransferTokens=[{token:b,scope:d}]}
function Am(a,b,c){if(Nc(c,1===Qc(c,Ig)?1:-1))var d=1;else if(c.getPlaylistId())d=2;else return;H(a,4,c);a=Rc(a,og,1)||new og;c=Rc(a,mg,3)||new mg;var e=new lg;e.setToken(b);G(e,1,d);Uc(c,12,lg,e);H(a,3,c)}
function zm(a){for(var b=[],c=0;c<a.length;c++)try{var d=b,e=d.push;var f=String(a[c]),g=Eg;if(null==f||""==f)var h=new g;else{var k=JSON.parse(f);if(!Array.isArray(k))throw Error("Expected to deserialize an Array but got "+Ka(k)+": "+k);Xc=k;var l=new g(k);Xc=null;h=l}e.call(d,h)}catch(n){eh(new Ei("Transport failed to deserialize "+String(a[c])))}return b}
;var Dm=A.ytLoggingGelSequenceIdObj_||{};C("ytLoggingGelSequenceIdObj_",Dm);function Em(a){Dm[a]=a in Dm?Dm[a]+1:0;return Dm[a]}
;function Fm(a,b){var c=void 0===c?{}:c;var d=Tl;O("ytLoggingEventsDefaultDisabled",!1)&&Tl==Tl&&(d=null);a:{c=void 0===c?{}:c;if(P("lr_drop_other_and_business_payloads")){if(Vl[a]||Ul[a])break a}else if(P("lr_drop_other_payloads")&&Vl[a])break a;var e={},f=Math.round(c.timestamp||Q());e.eventTimeMs=f<Number.MAX_SAFE_INTEGER?f:0;e[a]=b;a=Wl();e.context={lastActivityMs:String(c.timestamp||!isFinite(a)?-1:a)};P("log_sequence_info_on_gel_web")&&c.ia&&(a=e.context,b=c.ia,b={index:Em(b),groupKey:b},a.sequence=
b,c.jb&&delete Dm[c.ia]);(c.rb?rm:lm)({endpoint:"log_event",payload:e,P:c.P,da:c.da},d)}}
;var Gm=[{Ba:function(a){return"Cannot read property '"+a.key+"'"},
sa:{Error:[{regexp:/(Permission denied) to access property "([^']+)"/,groups:["reason","key"]}],TypeError:[{regexp:/Cannot read property '([^']+)' of (null|undefined)/,groups:["key","value"]},{regexp:/\u65e0\u6cd5\u83b7\u53d6\u672a\u5b9a\u4e49\u6216 (null|undefined) \u5f15\u7528\u7684\u5c5e\u6027\u201c([^\u201d]+)\u201d/,groups:["value","key"]},{regexp:/\uc815\uc758\ub418\uc9c0 \uc54a\uc74c \ub610\ub294 (null|undefined) \ucc38\uc870\uc778 '([^']+)' \uc18d\uc131\uc744 \uac00\uc838\uc62c \uc218 \uc5c6\uc2b5\ub2c8\ub2e4./,
groups:["value","key"]},{regexp:/No se puede obtener la propiedad '([^']+)' de referencia nula o sin definir/,groups:["key"]},{regexp:/Unable to get property '([^']+)' of (undefined or null) reference/,groups:["key","value"]},{regexp:/(null) is not an object \(evaluating '(?:([^.]+)\.)?([^']+)'\)/,groups:["value","base","key"]}]}},{Ba:function(a){return"Cannot call '"+a.key+"'"},
sa:{TypeError:[{regexp:/(?:([^ ]+)?\.)?([^ ]+) is not a function/,groups:["base","key"]},{regexp:/([^ ]+) called on (null or undefined)/,groups:["key","value"]},{regexp:/Object (.*) has no method '([^ ]+)'/,groups:["base","key"]},{regexp:/Object doesn't support property or method '([^ ]+)'/,groups:["key"]},{regexp:/\u30aa\u30d6\u30b8\u30a7\u30af\u30c8\u306f '([^']+)' \u30d7\u30ed\u30d1\u30c6\u30a3\u307e\u305f\u306f\u30e1\u30bd\u30c3\u30c9\u3092\u30b5\u30dd\u30fc\u30c8\u3057\u3066\u3044\u307e\u305b\u3093/,
groups:["key"]},{regexp:/\uac1c\uccb4\uac00 '([^']+)' \uc18d\uc131\uc774\ub098 \uba54\uc11c\ub4dc\ub97c \uc9c0\uc6d0\ud558\uc9c0 \uc54a\uc2b5\ub2c8\ub2e4./,groups:["key"]}]}},{Ba:function(a){return a.key+" is not defined"},
sa:{ReferenceError:[{regexp:/(.*) is not defined/,groups:["key"]},{regexp:/Can't find variable: (.*)/,groups:["key"]}]}}];var Im={X:[],V:[{eb:Hm,weight:500}]};function Hm(a){if("JavaException"===a.name)return!0;a=a.stack;return a.includes("chrome://")||a.includes("chrome-extension://")||a.includes("moz-extension://")}
;function Jm(){this.V=[];this.X=[]}
var Km;function Lm(){if(!Km){var a=Km=new Jm;a.X.length=0;a.V.length=0;Im.X&&a.X.push.apply(a.X,Im.X);Im.V&&a.V.push.apply(a.V,Im.V)}return Km}
;var Mm=new L;function Nm(a){function b(){return a.charCodeAt(d++)}
var c=a.length,d=0;do{var e=Om(b);if(Infinity===e)break;var f=e>>3;switch(e&7){case 0:e=Om(b);if(2===f)return e;break;case 1:if(2===f)return;d+=8;break;case 2:e=Om(b);if(2===f)return a.substr(d,e);d+=e;break;case 5:if(2===f)return;d+=4;break;default:return}}while(d<c)}
function Om(a){var b=a(),c=b&127;if(128>b)return c;b=a();c|=(b&127)<<7;if(128>b)return c;b=a();c|=(b&127)<<14;if(128>b)return c;b=a();return 128>b?c|(b&127)<<21:Infinity}
;function Pm(a,b,c,d){if(a)if(Array.isArray(a)){var e=d;for(d=0;d<a.length&&!(a[d]&&(e+=Qm(d,a[d],b,c),500<e));d++);d=e}else if("object"===typeof a)for(e in a){if(a[e]){var f=a[e];var g=b;var h=c;g="string"!==typeof f||"clickTrackingParams"!==e&&"trackingParams"!==e?0:(f=Nm(atob(f.replace(/-/g,"+").replace(/_/g,"/"))))?Qm(e+".ve",f,g,h):0;d+=g;d+=Qm(e,a[e],b,c);if(500<d)break}}else c[b]=Rm(a),d+=c[b].length;else c[b]=Rm(a),d+=c[b].length;return d}
function Qm(a,b,c,d){c+="."+a;a=Rm(b);d[c]=a;return c.length+a.length}
function Rm(a){try{return("string"===typeof a?a:String(JSON.stringify(a))).substr(0,500)}catch(b){return"unable to serialize "+typeof a+" ("+b.message+")"}}
;var Sm=A.ytLoggingGelSequenceIdObj_||{};C("ytLoggingGelSequenceIdObj_",Sm);function Tm(a){var b=void 0;b=void 0===b?{}:b;var c=!1;O("ytLoggingEventsDefaultDisabled",!1)&&Tl===Tl&&(c=!0);c=c?null:Tl;b=void 0===b?{}:b;var d=Math.round(b.timestamp||Q());G(a,1,d<Number.MAX_SAFE_INTEGER?d:0);var e=Wl();d=new Dg;G(d,1,b.timestamp||!isFinite(e)?-1:e);if(P("log_sequence_info_on_gel_web")&&b.ia){e=b.ia;var f=Em(e),g=new Cg;G(g,2,f);G(g,1,e);H(d,3,g);b.jb&&delete Sm[b.ia]}H(a,33,d);(b.rb?tm:om)({endpoint:"log_event",payload:a,P:b.P,da:b.da},c)}
;var Um=new Set,Vm=0,Wm=0,Xm=0,Ym=[],Zm=["PhantomJS","Googlebot","TO STOP THIS SECURITY SCAN go/scan"];function $m(){for(var a=t(Zm),b=a.next();!b.done;b=a.next()){var c=Fb();if(c&&0<=c.toLowerCase().indexOf(b.value.toLowerCase()))return!0}return!1}
;var an={};function bn(a){return an[a]||(an[a]=String(a).replace(/\-([a-z])/g,function(b,c){return c.toUpperCase()}))}
;var cn={},dn=[],Nf=new L,en={};function fn(){for(var a=t(dn),b=a.next();!b.done;b=a.next())b=b.value,b()}
function gn(a,b){var c;"yt:"===a.tagName.toLowerCase().substr(0,3)?c=a.getAttribute(b):c=a?a.dataset?a.dataset[bn(b)]:a.getAttribute("data-"+b):null;return c}
function hn(a){Nf.ca.apply(Nf,arguments)}
;function jn(a){this.h=a||{};a=[this.h,window.YTConfig||{}];for(var b=0;b<a.length;b++)a[b].host&&(a[b].host=a[b].host.toString().replace("http://","https://"))}
function kn(a,b){a=[a.h,window.YTConfig||{}];for(var c=0;c<a.length;c++){var d=a[c][b];if(void 0!==d)return d}return null}
function ln(a,b,c){mn||(mn={},nh(window,"message",function(d){a:{if(d.origin===kn(a,"host")){try{var e=JSON.parse(d.data)}catch(f){e=void 0;break a}if(d=mn[e.id])d.u=!0,d.u&&(D(d.v,d.sendMessage,d),d.v.length=0),d.Ga(e)}e=void 0}return e}));
mn[c]=b}
var mn=null;function nn(a,b,c){this.m=this.h=this.i=null;this.j=0;this.u=!1;this.v=[];this.l=null;this.I={};if(!a)throw Error("YouTube player element ID required.");this.id=Na(this);this.A=c;this.setup(a,b)}
m=nn.prototype;m.setSize=function(a,b){this.h.width=a.toString();this.h.height=b.toString();return this};
m.getIframe=function(){return this.h};
m.Ga=function(a){on(this,a.event,a)};
m.addEventListener=function(a,b){var c=b;"string"===typeof b&&(c=function(){window[b].apply(window,arguments)});
if(!c)return this;this.l.subscribe(a,c);pn(this,a);return this};
function qn(a,b){b=b.split(".");if(2===b.length){var c=b[1];a.A===b[0]&&pn(a,c)}}
m.destroy=function(){this.h&&this.h.id&&(cn[this.h.id]=null);var a=this.l;a&&"function"==typeof a.dispose&&a.dispose();if(this.m){a=this.h;var b=a.parentNode;b&&b.replaceChild(this.m,a)}else(a=this.h)&&a.parentNode&&a.parentNode.removeChild(a);mn&&(mn[this.id]=null);this.i=null;a=this.h;for(var c in ib)ib[c][0]==a&&lh(c);this.m=this.h=null};
m.Ja=function(){return{}};
function rn(a,b,c){c=c||[];c=Array.prototype.slice.call(c);b={event:"command",func:b,args:c};a.u?a.sendMessage(b):a.v.push(b)}
function on(a,b,c){a.l.l||(c={target:a,data:c},a.l.ca(b,c),hn(a.A+"."+b,c))}
function sn(a,b){var c=document.createElement("iframe");b=b.attributes;for(var d=0,e=b.length;d<e;d++){var f=b[d].value;null!=f&&""!==f&&"null"!==f&&c.setAttribute(b[d].name,f)}c.setAttribute("frameBorder","0");c.setAttribute("allowfullscreen","1");c.setAttribute("allow","accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture");c.setAttribute("title","YouTube "+kn(a.i,"title"));(b=kn(a.i,"width"))&&c.setAttribute("width",b.toString());(b=kn(a.i,"height"))&&c.setAttribute("height",
b.toString());var g=a.Ja();g.enablejsapi=window.postMessage?1:0;window.location.host&&(g.origin=window.location.protocol+"//"+window.location.host);g.widgetid=a.id;window.location.href&&D(["debugjs","debugcss"],function(h){var k=Ub(window.location.href,h);null!==k&&(g[h]=k)});
window.yt_embedsTokenValue&&(g.embedsTokenValue=encodeURIComponent(window.yt_embedsTokenValue),delete window.yt_embedsTokenValue);c.src=kn(a.i,"host")+("/embed/"+kn(a.i,"videoId"))+"?"+Sb(g);return c}
m.Ta=function(){this.h&&this.h.contentWindow?this.sendMessage({event:"listening"}):window.clearInterval(this.j)};
function tn(a){ln(a.i,a,a.id);a.j=ph(a.Ta.bind(a));nh(a.h,"load",function(){window.clearInterval(a.j);a.j=ph(a.Ta.bind(a))})}
m.setup=function(a,b){var c=document;if(a="string"===typeof a?c.getElementById(a):a)if(c="iframe"===a.tagName.toLowerCase(),b.host||(b.host=c?Mb(a.src):"https://www.youtube.com"),this.i=new jn(b),c||(b=sn(this,a),this.m=a,(c=a.parentNode)&&c.replaceChild(b,a),a=b),this.h=a,this.h.id||(this.h.id="widget"+Na(this.h)),cn[this.h.id]=this,window.postMessage){this.l=new L;tn(this);b=kn(this.i,"events");for(var d in b)b.hasOwnProperty(d)&&this.addEventListener(d,b[d]);for(var e in en)en.hasOwnProperty(e)&&
qn(this,e)}};
function pn(a,b){a.I[b]||(a.I[b]=!0,rn(a,"addEventListener",[b]))}
m.sendMessage=function(a){a.id=this.id;a.channel="widget";var b=Xe(a),c=[Mb(this.h.src||"").replace("http:","https:")];if(this.h.contentWindow)for(var d=0;d<c.length;d++)try{this.h.contentWindow.postMessage(b,c[d])}catch(Nb){if(Nb.name&&"SyntaxError"===Nb.name){if(!(Nb.message&&0<Nb.message.indexOf("target origin ''"))){var e=void 0,f=Nb;e=void 0===e?{}:e;e.name=O("INNERTUBE_CONTEXT_CLIENT_NAME",1);e.version=O("INNERTUBE_CONTEXT_CLIENT_VERSION");var g=e||{},h="WARNING";h=void 0===h?"ERROR":h;if(f){f.hasOwnProperty("level")&&
f.level&&(h=f.level);if(P("console_log_js_exceptions")){var k=f,l=[];l.push("Name: "+k.name);l.push("Message: "+k.message);k.hasOwnProperty("params")&&l.push("Error Params: "+JSON.stringify(k.params));k.hasOwnProperty("args")&&l.push("Error args: "+JSON.stringify(k.args));l.push("File name: "+k.fileName);l.push("Stacktrace: "+k.stack);window.console.log(l.join("\n"),k)}if(!(5<=Vm)){var n=void 0,q=void 0,v=void 0,p=f,z=g,y=Hd(p),F=y.message||"Unknown Error",M=y.name||"UnknownError",K=y.stack||p.i||
"Not available";if(K.startsWith(M+": "+F)){var N=K.split("\n");N.shift();K=N.join("\n")}var cb=y.lineNumber||"Not available",hc=y.fileName||"Not available",Ae=K,Z=z,S=0;if(p.hasOwnProperty("args")&&p.args&&p.args.length)for(var U=0;U<p.args.length&&!(S=Pm(p.args[U],"params."+U,Z,S),500<=S);U++);else if(p.hasOwnProperty("params")&&p.params){var V=p.params;if("object"===typeof p.params)for(q in V){if(V[q]){var ka="params."+q,rj=Rm(V[q]);Z[ka]=rj;S+=ka.length+rj.length;if(500<S)break}}else Z.params=
Rm(V)}if(Ym.length)for(var rd=0;rd<Ym.length&&!(S=Pm(Ym[rd],"params.context."+rd,Z,S),500<=S);rd++);navigator.vendor&&!Z.hasOwnProperty("vendor")&&(Z["device.vendor"]=navigator.vendor);var jb={message:F,name:M,lineNumber:cb,fileName:hc,stack:Ae,params:Z,sampleWeight:1},sj=Number(p.columnNumber);isNaN(sj)||(jb.lineNumber=jb.lineNumber+":"+sj);if("IGNORED"===p.level)n=0;else a:{for(var tj=Lm(),uj=t(tj.X),nf=uj.next();!nf.done;nf=uj.next()){var vj=nf.value;if(jb.message&&jb.message.match(vj.Pb)){n=vj.weight;
break a}}for(var wj=t(tj.V),of=wj.next();!of.done;of=wj.next()){var xj=of.value;if(xj.eb(jb)){n=xj.weight;break a}}n=1}jb.sampleWeight=n;v=jb;for(var yj=t(Gm),pf=yj.next();!pf.done;pf=yj.next()){var qf=pf.value;if(qf.sa[v.name])for(var zj=t(qf.sa[v.name]),rf=zj.next();!rf.done;rf=zj.next()){var Aj=rf.value,sd=v.message.match(Aj.regexp);if(sd){v.params["params.error.original"]=sd[0];for(var sf=Aj.groups,Bj={},Ob=0;Ob<sf.length;Ob++)Bj[sf[Ob]]=sd[Ob+1],v.params["params.error."+sf[Ob]]=sd[Ob+1];v.message=
qf.Ba(Bj);break}}}v.params||(v.params={});var Cj=Lm();v.params["params.errorServiceSignature"]="msg="+Cj.X.length+"&cb="+Cj.V.length;v.params["params.serviceWorker"]="false";A.document&&A.document.querySelectorAll&&(v.params["params.fscripts"]=String(document.querySelectorAll("script:not([nonce])").length));vb("sample").constructor!==ub&&(v.params["params.fconst"]="true");var pa=v;window.yterr&&"function"===typeof window.yterr&&window.yterr(pa);if(0!==pa.sampleWeight&&!Um.has(pa.message)){if("ERROR"===
h){Mm.ca("handleError",pa);if(P("record_app_crashed_web")&&0===Xm&&1===pa.sampleWeight)if(Xm++,P("errors_via_jspb")){var tf=new Bg;G(tf,1,1);if(!P("report_client_error_with_app_crash_ks")){var Dj=new wg;G(Dj,1,pa.message);var Ej=new xg;H(Ej,3,Dj);var Fj=new yg;H(Fj,5,Ej);var Gj=new zg;H(Gj,9,Fj);H(tf,4,Gj)}var zn=tf,Hj=new Eg;Tc(Hj,20,Fg,zn);Tm(Hj)}else{var Ij={appCrashType:"APP_CRASH_TYPE_BREAKPAD"};P("report_client_error_with_app_crash_ks")||(Ij.systemHealth={crashData:{clientError:{logMessage:{message:pa.message}}}});
Fm("appCrashed",Ij)}Wm++}else"WARNING"===h&&Mm.ca("handleWarning",pa);if(P("kevlar_gel_error_routing"))a:{var uf=void 0,vf=void 0,qc=h,R=pa;if(P("errors_via_jspb")){if($m())vf=void 0;else{var Pb=new tg;G(Pb,1,R.stack);R.fileName&&G(Pb,4,R.fileName);var Fa=R.lineNumber&&R.lineNumber.split?R.lineNumber.split(":"):[];0!==Fa.length&&(1!==Fa.length||isNaN(Number(Fa[0]))?2!==Fa.length||isNaN(Number(Fa[0]))||isNaN(Number(Fa[1]))||(G(Pb,2,Number(Fa[0])),G(Pb,3,Number(Fa[1]))):G(Pb,2,Number(Fa[0])));var kb=
new wg;G(kb,1,R.message);G(kb,3,R.name);G(kb,6,R.sampleWeight);"ERROR"===qc?G(kb,2,2):"WARNING"===qc?G(kb,2,1):G(kb,2,0);var wf=new ug;G(wf,1,!0);Tc(wf,3,vg,Pb);var lb=new qg;G(lb,3,window.location.href);for(var Jj=O("FEXP_EXPERIMENTS",[]),xf=0;xf<Jj.length;xf++){var Kj=lb,An=Jj[xf];Ec(Kj);Oc(Kj,5).push(An)}var yf=$g();if(!ah()&&yf)for(var Lj=t(Object.keys(yf)),mb=Lj.next();!mb.done;mb=Lj.next()){var Mj=mb.value,zf=new sg;G(zf,1,Mj);zf.setValue(String(yf[Mj]));Uc(lb,4,sg,zf)}var Af=R.params;if(Af){var Nj=
t(Object.keys(Af));for(mb=Nj.next();!mb.done;mb=Nj.next()){var Oj=mb.value,Bf=new sg;G(Bf,1,"client."+Oj);Bf.setValue(String(Af[Oj]));Uc(lb,4,sg,Bf)}}var Pj=O("SERVER_NAME"),Qj=O("SERVER_VERSION");if(Pj&&Qj){var Cf=new sg;G(Cf,1,"server.name");Cf.setValue(Pj);Uc(lb,4,sg,Cf);var Df=new sg;G(Df,1,"server.version");Df.setValue(Qj);Uc(lb,4,sg,Df)}var td=new xg;H(td,1,lb);H(td,2,wf);H(td,3,kb);vf=td}var Rj=vf;if(!Rj)break a;var Sj=new Eg;Tc(Sj,163,Fg,Rj);Tm(Sj)}else{if($m())uf=void 0;else{var rc={stackTrace:R.stack};
R.fileName&&(rc.filename=R.fileName);var Ga=R.lineNumber&&R.lineNumber.split?R.lineNumber.split(":"):[];0!==Ga.length&&(1!==Ga.length||isNaN(Number(Ga[0]))?2!==Ga.length||isNaN(Number(Ga[0]))||isNaN(Number(Ga[1]))||(rc.lineNumber=Number(Ga[0]),rc.columnNumber=Number(Ga[1])):rc.lineNumber=Number(Ga[0]));var Ef={level:"ERROR_LEVEL_UNKNOWN",message:R.message,errorClassName:R.name,sampleWeight:R.sampleWeight};"ERROR"===qc?Ef.level="ERROR_LEVEL_ERROR":"WARNING"===qc&&(Ef.level="ERROR_LEVEL_WARNNING");
var Bn={isObfuscated:!0,browserStackInfo:rc},Qb={pageUrl:window.location.href,kvPairs:[]};O("FEXP_EXPERIMENTS")&&(Qb.experimentIds=O("FEXP_EXPERIMENTS"));var Ff=$g();if(!ah()&&Ff)for(var Tj=t(Object.keys(Ff)),nb=Tj.next();!nb.done;nb=Tj.next()){var Uj=nb.value;Qb.kvPairs.push({key:Uj,value:String(Ff[Uj])})}var Gf=R.params;if(Gf){var Vj=t(Object.keys(Gf));for(nb=Vj.next();!nb.done;nb=Vj.next()){var Wj=nb.value;Qb.kvPairs.push({key:"client."+Wj,value:String(Gf[Wj])})}}var Xj=O("SERVER_NAME"),Yj=O("SERVER_VERSION");
Xj&&Yj&&(Qb.kvPairs.push({key:"server.name",value:Xj}),Qb.kvPairs.push({key:"server.version",value:Yj}));uf={errorMetadata:Qb,stackTrace:Bn,logMessage:Ef}}var Zj=uf;if(!Zj)break a;Fm("clientError",Zj)}("ERROR"===qc||P("errors_flush_gel_always_killswitch"))&&pm(void 0,void 0,!1)}if(!P("suppress_error_204_logging")){var ob=pa,sc=ob.params||{},Sa={urlParams:{a:"logerror",t:"jserror",type:ob.name,msg:ob.message.substr(0,250),line:ob.lineNumber,level:h,"client.name":sc.name},postParams:{url:O("PAGE_NAME",
window.location.href),file:ob.fileName},method:"POST"};sc.version&&(Sa["client.version"]=sc.version);if(Sa.postParams){ob.stack&&(Sa.postParams.stack=ob.stack);for(var ak=t(Object.keys(sc)),Hf=ak.next();!Hf.done;Hf=ak.next()){var bk=Hf.value;Sa.postParams["client."+bk]=sc[bk]}var If=$g();if(If)for(var ck=t(Object.keys(If)),Jf=ck.next();!Jf.done;Jf=ck.next()){var dk=Jf.value;Sa.postParams[dk]=If[dk]}var ek=O("SERVER_NAME"),fk=O("SERVER_VERSION");ek&&fk&&(Sa.postParams["server.name"]=ek,Sa.postParams["server.version"]=
fk)}Lh(O("ECATCHER_REPORT_HOST","")+"/error_204",Sa)}try{Um.add(pa.message)}catch(Gn){}Vm++}}}}}else throw Nb;}else console&&console.warn&&console.warn("The YouTube player is not attached to the DOM. API calls should be made after the onReady event. See more: https://developers.google.com/youtube/iframe_api_reference#Events")};function un(a){return(0===a.search("cue")||0===a.search("load"))&&"loadModule"!==a}
function vn(a){return 0===a.search("get")||0===a.search("is")}
;function wn(a,b){nn.call(this,a,Object.assign({title:"video player",videoId:"",width:640,height:360},b||{}),"player");this.M={};this.playerInfo={}}
u(wn,nn);m=wn.prototype;m.Ja=function(){var a=kn(this.i,"playerVars");if(a){var b={},c;for(c in a)b[c]=a[c];a=b}else a={};window!==window.top&&document.referrer&&(a.widget_referrer=document.referrer.substring(0,256));if(c=kn(this.i,"embedConfig")){if(Ma(c))try{c=JSON.stringify(c)}catch(d){console.error("Invalid embed config JSON",d)}a.embed_config=c}return a};
m.Ga=function(a){var b=a.event;a=a.info;switch(b){case "apiInfoDelivery":if(Ma(a))for(var c in a)a.hasOwnProperty(c)&&(this.M[c]=a[c]);break;case "infoDelivery":xn(this,a);break;case "initialDelivery":Ma(a)&&(window.clearInterval(this.j),this.playerInfo={},this.M={},yn(this,a.apiInterface),xn(this,a));break;default:on(this,b,a)}};
function xn(a,b){if(Ma(b))for(var c in b)b.hasOwnProperty(c)&&(a.playerInfo[c]=b[c])}
function yn(a,b){D(b,function(c){this[c]||("getCurrentTime"===c?this[c]=function(){var d=this.playerInfo.currentTime;if(1===this.playerInfo.playerState){var e=(Date.now()/1E3-this.playerInfo.currentTimeLastUpdated_)*this.playerInfo.playbackRate;0<e&&(d+=Math.min(e,1))}return d}:un(c)?this[c]=function(){this.playerInfo={};
this.M={};rn(this,c,arguments);return this}:vn(c)?this[c]=function(){var d=0;
0===c.search("get")?d=3:0===c.search("is")&&(d=2);return this.playerInfo[c.charAt(d).toLowerCase()+c.substr(d+1)]}:this[c]=function(){rn(this,c,arguments);
return this})},a)}
m.getVideoEmbedCode=function(){var a=kn(this.i,"host")+("/embed/"+kn(this.i,"videoId")),b=Number(kn(this.i,"width")),c=Number(kn(this.i,"height"));if(isNaN(b)||isNaN(c))throw Error("Invalid width or height property");b=Math.floor(b);c=Math.floor(c);Eb.test(a)&&(-1!=a.indexOf("&")&&(a=a.replace(yb,"&amp;")),-1!=a.indexOf("<")&&(a=a.replace(zb,"&lt;")),-1!=a.indexOf(">")&&(a=a.replace(Ab,"&gt;")),-1!=a.indexOf('"')&&(a=a.replace(Bb,"&quot;")),-1!=a.indexOf("'")&&(a=a.replace(Cb,"&#39;")),-1!=a.indexOf("\x00")&&
(a=a.replace(Db,"&#0;")));return'<iframe width="'+b+'" height="'+c+'" src="'+a+'" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>'};
m.getOptions=function(a){return this.M.namespaces?a?this.M[a]?this.M[a].options||[]:[]:this.M.namespaces||[]:[]};
m.getOption=function(a,b){if(this.M.namespaces&&a&&b&&this.M[a])return this.M[a][b]};
function Cn(a){if("iframe"!==a.tagName.toLowerCase()){var b=gn(a,"videoid");b&&(b={videoId:b,width:gn(a,"width"),height:gn(a,"height")},new wn(a,b))}}
;C("YT.PlayerState.UNSTARTED",-1);C("YT.PlayerState.ENDED",0);C("YT.PlayerState.PLAYING",1);C("YT.PlayerState.PAUSED",2);C("YT.PlayerState.BUFFERING",3);C("YT.PlayerState.CUED",5);C("YT.get",function(a){return cn[a]});
C("YT.scan",fn);C("YT.subscribe",function(a,b,c){Nf.subscribe(a,b,c);en[a]=!0;for(var d in cn)cn.hasOwnProperty(d)&&qn(cn[d],a)});
C("YT.unsubscribe",function(a,b,c){Mf(a,b,c)});
C("YT.Player",wn);nn.prototype.destroy=nn.prototype.destroy;nn.prototype.setSize=nn.prototype.setSize;nn.prototype.getIframe=nn.prototype.getIframe;nn.prototype.addEventListener=nn.prototype.addEventListener;wn.prototype.getVideoEmbedCode=wn.prototype.getVideoEmbedCode;wn.prototype.getOptions=wn.prototype.getOptions;wn.prototype.getOption=wn.prototype.getOption;
dn.push(function(a){var b=a;b||(b=document);a=eb(b.getElementsByTagName("yt:player"));var c=b||document;if(c.querySelectorAll&&c.querySelector)b=c.querySelectorAll(".yt-player");else{var d;c=document;b=b||c;if(b.querySelectorAll&&b.querySelector)b=b.querySelectorAll(".yt-player");else if(b.getElementsByClassName){var e=b.getElementsByClassName("yt-player");b=e}else{e=b.getElementsByTagName("*");var f={};for(c=d=0;b=e[c];c++){var g=b.className,h;if(h="function"==typeof g.split)h=0<=$a(g.split(/\s+/),
"yt-player");h&&(f[d++]=b)}f.length=d;b=f}}b=eb(b);D(db(a,b),Cn)});
"undefined"!=typeof YTConfig&&YTConfig.parsetags&&"onload"!=YTConfig.parsetags||fn();var Dn=A.onYTReady;Dn&&Dn();var En=A.onYouTubeIframeAPIReady;En&&En();var Fn=A.onYouTubePlayerAPIReady;Fn&&Fn();}).call(this);
