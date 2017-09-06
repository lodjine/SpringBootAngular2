
angular.module('meteoreApp').controller('listcategoriesCtrl', listcategoriesCtrl);

listcategoriesCtrl.$inject = ['$scope','CategorieService','$state'];

	function listcategoriesCtrl($scope,CategorieService,$state){
	
		$scope.categories=CategorieService.query();
		
$scope.deleteCategorie=function deleteCategorie(idC){
	CategorieService.delete({id:idC});
	$state.reload();
		}

$scope.validationCategorie = function(categorie) {
	CategorieService.save(categorie);
	$state.reload();

}

		
	};
 
		

 