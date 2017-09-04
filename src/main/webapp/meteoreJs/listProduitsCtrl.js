
angular.module('meteoreApp').controller('listProduitsCtrl', listProduitsCtrl);

listProduitsCtrl.$inject = ['$scope','ProduitsService'];

	function listProduitsCtrl($scope,ProduitsService ){
	
		$scope.produits=ProduitsService.query();
		
		
		$scope.deleteProduit=function deleteProduit(id){
			ProduitsService.delete({id:id});
		}
		
	};