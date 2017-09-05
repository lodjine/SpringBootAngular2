angular.module('meteoreApp').controller('listFournisseurCtrl', listFournisseurCtrl);

listFournisseurCtrl.$inject = ['$scope','FournisseurService'];

	function listFournisseurCtrl($scope,FournisseurService ){
	
		$scope.fournisseurs=FournisseurService.query();
		
		$scope.deleteFournisseur=function deleteFournisseur(id){
			FournisseurService.delete({id:id});
		
	};