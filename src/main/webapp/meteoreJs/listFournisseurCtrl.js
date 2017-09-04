angular.module('meteoreApp').controller('listFournisseurCtrl', listFournisseurCtrl);

listFournisseurCtrl.$inject = ['$scope','FournisseurService'];

	function listFournisseurCtrl($scope,FournisseurService ){
	
		$scope.fournisseurs=FournisseurService.query();
		
	};