angular.module('meteoreApp').controller('listFournisseurCtrl', listFournisseurCtrl);

listFournisseurCtrl.$inject = ['$scope','FournisseurService', '$window'];

	function listFournisseurCtrl($scope,FournisseurService ,$window){
	
		$scope.fournisseurs=FournisseurService.query();
		
		$scope.deleteFournisseur=function deleteFournisseur(idF){
			FournisseurService.delete({id:idF});
			$window.location.reload();
		}
	};