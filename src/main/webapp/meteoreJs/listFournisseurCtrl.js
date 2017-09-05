angular.module('meteoreApp').controller('listFournisseurCtrl', listFournisseurCtrl);

listFournisseurCtrl.$inject = ['$scope','FournisseurService', '$state'];

	function listFournisseurCtrl($scope,FournisseurService ,$state){
	
		$scope.fournisseurs=FournisseurService.query();
		
		$scope.deleteFournisseur=function deleteFournisseur(idF){
			FournisseurService.delete({id:idF});
			$state.reload();
		}
	};