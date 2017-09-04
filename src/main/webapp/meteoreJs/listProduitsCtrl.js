
angular.module('meteoreApp').controller('listProduitsCtrl', listProduitsCtrl);

listProduitsCtrl.$inject = ['$scope','listProduitsService'];

	function listProduitsCtrl($scope,listProduitsService ){
	
		$scope.produits=listProduitsService.query();
		
	};
 
 