
angular.module('meteoreApp').controller('listProduitsCtrl', listProduitsCtrl);

listProduitsCtrl.$inject = ['$scope','ProduitsService'];

	function listProduitsCtrl($scope,ProduitsService ){
	
		$scope.produits=ProduitsService.query();
		
	};
 
 