(function() {
	'use strict';
	angular.module('meteoreApp').factory('QuantiteService', QuantiteService);

	QuantiteService.$inject = [ '$resource' ];

	function QuantiteService($resource) {

		var resourceUrl = '/quantite/:id';
		return $resource(resourceUrl, {}, {

		});

	}
})();