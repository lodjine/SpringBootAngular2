angular.module('meteoreApp').controller('listfournisseurCtrl', listfournisseurCtrl);

listfournisseurCtrl.$inject = ['$scope','FournisseurService'];

	function listfournisseurCtrl($scope,FournisseurService ){
	
		$scope.fournisseurs=FournisseurService.query();
		
	};