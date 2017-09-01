
var app=angular.module('metoreApp');

 var ctrl=app.controller('listMagasinsCtrl',  function($scope,$window) {
   $scope.listMagasinsFct=function() {
	   $window.location.href = '/listMagasins.html';
   }
});
 