
angular.module('meteoreApp').controller('listMagasinsCtrl', listMagasinsCtrl);

listMagasinsCtrl.$inject = ['$scope', 'listMagasinsService'];

	function listMagasinsCtrl($scope, listMagasinsService){
		$scope.listMagasins=listMagasinsService.query();
	};
 