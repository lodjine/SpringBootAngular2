(function(){
	'use strict';
	angular.module('meteoreApp').factory('MagasinListService', MagasinListService);

    Magasin.$inject = ['$resource'];

    function ListMagasin ($resource) {
//    	la meme que le web service en java :
    	var resourceUrl =  '/localites/:id';
    	return $resource(resourceUrl, {}, {});
    }
};