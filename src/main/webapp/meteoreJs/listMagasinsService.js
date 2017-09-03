(function(){
	'use strict';
	angular.module('meteoreApp').factory('MagasinListService', MagasinListService);

    Magasin.$inject = ['$resource'];

    function ListMagasin ($resource) {
    	var resourceUrl =  '/localites/:id';
    	return $resource(resourceUrl, {}, {});
    }
};