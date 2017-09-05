
angular.module('meteoreApp').controller('listcategoriesCtrl', listcategoriesCtrl);

listcategoriesCtrl.$inject = ['$scope','CategorieService'];

	function listcategoriesCtrl($scope,CategorieService ){
	
		$scope.categories=CategorieService.query();
		
$scope.deleteCategorie=function deleteCategorie(idC){
	CategorieService.delete({id:idC});
		}
		
	};
 
		

 