
var app=angular.module('metoreApp');

 var ctrl=app.controller('listmagasinsCtrl',  function($scope,$window) {
   $scope.loginFct=function() {
	   $window.location.href = '/listmagasins.html';
   }
});
 