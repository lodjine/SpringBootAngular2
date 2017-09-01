(function() {
    'use strict';
    angular
        .module('meteoreApp')
        .factory('MagasinFormService', MagasinFormService);

    MagasinFormService.$inject = ['$resource'];

    function MagasinFormService ($resource) {
    	
    	var resourceUrl =  '/localites/:id';
    	return $resource(resourceUrl, {}, {});
    	
    }
})();