
angular.module('meteoreApp').controller('listcategoriesCtrl', listcategoriesCtrl);

listcategoriesCtrl.$inject = ['$scope','CategorieService','$window'];

	function listcategoriesCtrl($scope,CategorieService,$window ){
	
		$scope.categories=CategorieService.query();
		
$scope.deleteCategorie=function deleteCategorie(idC){
	CategorieService.delete({id:idC});
	$window.location.reload();
		}
		
	};
 
		

 