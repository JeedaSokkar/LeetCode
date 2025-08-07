/**
 * @param {Object|Array} obj
 * @return {boolean}
 */
var isEmpty = function(obj) {
       const x=JSON.stringify(obj)
if(x.length<=2)
   {
    return true
   }
   else {
    return false
   } 
};