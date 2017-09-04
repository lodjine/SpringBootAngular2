
angular.module('meteoreApp').controller('listMagasinsCtrl', listMagasinsCtrl);

listMagasinsCtrl.$inject = ['$scope', 'MagasinsListService'];

	function listMagasinsCtrl($scope, MagasinsListService){
		$scope.listMagasins=Localite.querry();
	};
 